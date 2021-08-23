package module9.homework2;

import java.io.File;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Что копировать");
            String objectPath = scanner1.nextLine();

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Куда копировать");
            String directoryPath = scanner2.nextLine();

            File object = new File(objectPath);
            File directory = new File(directoryPath);
            File[] listOfFiles = object.listFiles();

            File newObject = new File(String.valueOf(Files.copy(object.toPath(),
                    new File(directoryPath + File.separator + object.getName()).toPath())));
            for (File f : listOfFiles) {
                Files.copy(f.toPath(), new File(newObject.getPath() + File.separator + f.getName()).toPath());
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

package module11.HomeWork1;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

import static org.imgscalr.Scalr.*;

public class Main {
    public static int newWidth = 300;
    static String srcFolder = "D:/src";
    static String dstFolder = "D:/dst";
    static String dstStarFolder = "D:/dststar";

    public static void main(String[] args) {

        File srcDir = new File(srcFolder);

        long start = System.currentTimeMillis();

        File[] files = srcDir.listFiles();

        int part = files.length / 4;
        int middle = files.length / 2;

        try {
            for (File file : files) {
                BufferedImage image = ImageIO.read(file);
                BufferedImage newImage = resize(image, 300, 600, OP_BRIGHTER);
                File newFile = new File(dstStarFolder + "/" + file.getName());
                ImageIO.write(newImage, "jpg", newFile);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println(System.currentTimeMillis() - start);

        File[] files1 = new File[part];
        System.arraycopy(files, 0, files1, 0, files1.length);
        ImageResizer imageResizer1 = new ImageResizer(files1, newWidth, dstFolder, start);
        new Thread(imageResizer1).start();

        File[] files2 = new File[part];
        System.arraycopy(files, part, files2, 0, files2.length);
        ImageResizer imageResizer2 = new ImageResizer(files2, newWidth, dstFolder, start);
        new Thread(imageResizer2).start();

        File[] files3 = new File[part];
        System.arraycopy(files, (part*2), files3, 0, files3.length);
        ImageResizer imageResizer3 = new ImageResizer(files3, newWidth, dstFolder, start);
        new Thread(imageResizer3).start();

        File[] files4 = new File[part];
        System.arraycopy(files, (part*3), files4, 0, files4.length);
        ImageResizer imageResizer4 = new ImageResizer(files4, newWidth, dstFolder, start);
        new Thread(imageResizer4).start();
    }
}

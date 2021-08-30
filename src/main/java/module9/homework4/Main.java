package module9.homework4;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.swing.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //String htmlFile = parseFile("https://lenta.ru/");
        try {
            File folder = new File("images");
            folder.mkdir();

            Document doc = Jsoup.connect("https://lenta.ru/").get();

            Element link = doc.select("a").first();
            String relHref = link.attr("href"); // == "/"
            String absHref = link.attr("abs:href"); // "http://jsoup.org/"

            Elements elements = doc.select("img");
            elements.forEach(element -> {
                //System.out.println(element.attr("src"));
                File image = new File(element.attr("src"));

                //System.out.println(image);
//                try {
//                    copyFileUsingChannel(image, folder);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
                try {
                    Files.copy(Path.of(element.attr("src")), new File("images" + File.separator + image.getName()).toPath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            //Elements images = doc.select("")

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    private static void copyFileUsingChannel(File source, File dest) throws IOException {
        FileChannel sourceChannel = null;
        FileChannel destChannel = null;
        try {
            sourceChannel = new FileInputStream(source).getChannel();
            destChannel = new FileOutputStream(dest).getChannel();
            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        }finally{
            sourceChannel.close();
            destChannel.close();
        }
    }
//    public static String parseFile(String path) {
//        StringBuilder sb = new StringBuilder();
//        try{
//            List<String> lines = Files.readAllLines(Paths.get(path));
//            lines.forEach(line -> sb.append(line + "\n"));
//        }catch (Exception exception){
//            exception.printStackTrace();
//        }
//        return sb.toString();
//    }
}

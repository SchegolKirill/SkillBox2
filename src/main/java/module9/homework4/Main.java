package module9.homework4;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.swing.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            File folder = new File("images");
            folder.mkdir();

            Document doc = Jsoup.connect("https://lenta.ru/").get();

            Elements elements = doc.select("img");
            elements.forEach(element -> {
                String url1 = element.attr("src");

                Pattern p = Pattern.compile("^https://");
                Matcher m = p.matcher(url1);

                if(m.find()) {
                    File image = new File(url1);
                    try {
                        URL url = new URL(url1);
                        InputStream inputStream = url.openStream();
                        Files.copy(inputStream, new File(folder + "/" + image.getName()).toPath());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

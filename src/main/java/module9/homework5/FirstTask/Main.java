package module9.homework5.FirstTask;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) {
        JSONObject lines = new JSONObject();
        JSONArray linesArr = new JSONArray();

        JSONObject stations = new JSONObject();
        JSONObject stationLine = new JSONObject();
        JSONArray oneLineStations = new JSONArray();

        AtomicInteger x = new AtomicInteger(1);

        try (FileWriter file = new FileWriter("MoscowMetro.json")){
            Document doc = Jsoup.connect("https://www.moscowmap.ru/metro.html#lines").maxBodySize(0).get();
            Elements elements1 = doc.select("span");

            AtomicReference<String> counterNumberLine = null;
            elements1.forEach(element -> {
                String numberLine = element.attr("data-line");

                String nameLine = element.text();
                if(!numberLine.isEmpty()) {
//                    System.out.println(numberLine);
//                    System.out.println(nameLine);
                    JSONObject line = new JSONObject();
                    line.put("number", numberLine);
                    line.put("name", nameLine);
                    line.put("color", numberLine);
                    linesArr.add(line);
                }
                String spanClass = element.className();
                if(spanClass.equals("name")) {
                    //System.out.println(x + element.text());
                    oneLineStations.add(element.text());
                    stationLine.put(numberLine, oneLineStations);
                    x.incrementAndGet();
                }
            });
            stations.put("stations", stationLine);
            lines.put("lines", linesArr);

            file.write(lines.toJSONString());
            System.out.println(counterNumberLine);
//            System.out.println(Integer.toString(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
//        JSONObject obj = new JSONObject();
//        obj.put("name", "mkyong.com");
//        obj.put("age", 100);
//
//        JSONArray list = new JSONArray();
//        list.add("msg 1");
//        list.add("msg 2");
//        list.add("msg 3");
//
//        obj.put("messages", list);
//
//        try (FileWriter file = new FileWriter("test.json")) {
//            file.write(obj.toJSONString());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.print(obj);

    }
}

package module4.HomeWork6.BirthDay;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) {
        int day = 6;
        int month = 12;
        int year = 1995;
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy - E");
        Date date = new Date();
        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        for(int i = 0; i < 26; i++){
//            System.out.println(i + " - " + calendar.get(calendar.DAY_OF_MONTH) + "." + (calendar.get(calendar.MONTH) + 1) +
//            "." + calendar.get(calendar.YEAR) + " - " + calendar.get(calendar.DAY_OF_WEEK));
//            calendar.add(calendar.YEAR, 1);
            System.out.println(dateFormat.format(calendar.getTime()));
            calendar.add(calendar.YEAR, 1);
        }


    }
}

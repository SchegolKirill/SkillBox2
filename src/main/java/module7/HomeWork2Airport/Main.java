package module7.HomeWork2Airport;

import com.skillbox.airport.Airport;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Airport ap = Airport.getInstance();
        Date date  = new Date();
        System.out.println(date.getHours() + "\n");


        ap.getTerminals().forEach(terminal -> terminal.getFlights()
                        .stream()
                        .filter(flight -> flight.getDate().getHours() <= date.getHours() + 2
                                && flight.getDate().getHours() >= date.getHours())
                .forEach(flight -> System.out.println(flight.toString() + " -> " + flight.getAircraft())));
    }
}

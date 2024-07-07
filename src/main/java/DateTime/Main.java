package DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){
        String dateString = "2024-03-05T15:30:00.97";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SS");
        LocalDateTime dateTime = LocalDateTime.parse(dateString, formatter);

        System.out.println("Parsed date-time: " + dateTime);
    }
}


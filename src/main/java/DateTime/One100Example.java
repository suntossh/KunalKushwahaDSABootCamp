package DateTime;



import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class One100Example {
    public static void main(String[] args) {
        String[] dateStrings = {
                "2024-03-05T15:30:00.97",
                "2024-03-05T15:30:00",
                "2024-03-05T15:30:00.123",
                "2024-03-05T15:30:00.123Z",
                "2024-03-05T15:30:00Z",
                "2024-03-05T15:30:00+05:00",
                "2024-03-05T15:30:00-05:00",
                "2024-03-05T15:30:00.123+05:00",
                "2024-03-05T15:30:00.123-05:00",
                "2024-03-05T15:30:00.123456789",
                "2024-03-05T15:30:00.123456789Z",
                "2024-03-05T15:30:00.123456789+05:00",
                "2024-03-05T15:30:00.123456789-05:00",
                "2024-03-05T15:30",
                "2024-03-05T15:30Z",
                "2024-03-05T15:30+05:00",
                "2024-03-05T15:30-05:00",
                "2024-03-05T04:00:00-08:00",  // Pacific Time (PT)
                "2024-03-05T13:00:00+01:00",  // Central European Time (CET)
                "2024-03-05T20:00:00+08:00",  // Singapore Time (SGT)
                "2024-03-05T20:00:00+08:00",  // China Standard Time (CST)
                "2024-03-06T05:46:00+05:30"   // Indian Standard Time (IST)

        };

//        for (String dateString : dateStrings) {
//            try {
//                LocalDateTime dateTime = LocalDateTime.parse(dateString, DateTimeFormatter.ISO_DATE_TIME);
//                System.out.println("Parsed date-time: " + dateTime);
//            } catch (DateTimeParseException e) {
//                System.out.println("Date string is not in ISO 8601 format: " + dateString);
//            }
//        }

        ZoneId easternZone = ZoneId.of("America/New_York");

        for (String dateString : dateStrings) {
            try {
                // Parse the date string
                LocalDateTime localDateTime = LocalDateTime.parse(dateString, DateTimeFormatter.ISO_DATE_TIME);

                // Convert to Eastern Time
                ZonedDateTime dateTimeInEastern = ZonedDateTime.of(localDateTime, easternZone);

                // Format the date-time string in Eastern Time
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SS");
                String formattedDateTime = dateTimeInEastern.format(formatter);

                // Print the parsed date-time in Eastern Time
                System.out.println(dateString+" Parsed date-time in Eastern Time: " + formattedDateTime);
            } catch (DateTimeParseException e) {
                System.out.println("Date string is not in ISO 8601 format: " + dateString);
            }
        }


    }
}


package DateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class ConvertToEastern {
    public static void main(String[] args) {
        // Example ISO 8601 date and time strings representing different time zones
        String[] dateStrings = {
                "2024-03-05T12:00:00Z",      // UTC
                "2024-03-05T04:00:00-08:00",  // Pacific Time (PT)
                "2024-03-05T13:00:00+01:00",  // Central European Time (CET)
                "2024-03-05T20:00:00+08:00",  // Singapore Time (SGT)
                "2024-03-05T20:00:00+08:00",  // China Standard Time (CST)
                "2024-03-06T05:46:00+05:30"   // Indian Standard Time (IST)
        };

        // Create a formatter for parsing ISO 8601 date-time strings
        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

        // Convert each date string to Eastern Time
        for (String dateString : dateStrings) {
            OffsetDateTime dateTime = OffsetDateTime.parse(dateString, formatter);
            ZonedDateTime easternTime = dateTime.atZoneSameInstant(ZoneId.of("America/New_York"));
            System.out.println("Converted to Eastern Time: " + easternTime.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
        }
    }
}


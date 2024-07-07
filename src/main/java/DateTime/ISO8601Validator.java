package DateTime;


import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ISO8601Validator {
    public static void main(String[] args) {
        // Example ISO 8601 date and time strings
        String[] dateStrings = {
                "2024-03-05",
                "2024-03-05T15:30:00",
                "2024-03-05T15:30:00Z",
                "2024-03-05T15:30:00+05:30",
                "2024-03-05T15:30:00.123",
                "2024-03-05T15:30:00.123Z",
                "2024-03-05T15:30:00.123+05:30"
        };

        // Create a DateTimeFormatter for ISO 8601 format
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;

        // Validate each date string
        for (String dateString : dateStrings) {
            try {
                formatter.parse(dateString);
                System.out.println("Valid ISO 8601 date/time: " + dateString);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid ISO 8601 date/time: " + dateString);
            }
        }
    }
}

package DateTime;

import java.time.LocalDateTime;
        import java.time.ZoneId;
        import java.time.ZonedDateTime;
        import java.time.format.DateTimeFormatter;

public class LastUpdatedOn {
    public static void main(String[] args) {
        // Get the US Eastern Time Zone
        ZoneId easternZone = ZoneId.of("America/New_York");

        // Get the current date and time in US Eastern Time
        ZonedDateTime currentTimeInEastern = ZonedDateTime.now(easternZone);

        // Format the current date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        String formattedTime = currentTimeInEastern.format(formatter);

        // Print the current date and time in US Eastern Time
        System.out.println("Current time in US Eastern Time: " + formattedTime);
    }
}


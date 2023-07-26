package july22;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
class Assignment14{
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the zone ID (e.g., America/New_York, Europe/London, Asia/Tokyo):");
	        String zoneIdInput = scanner.nextLine();
	        if (ZoneId.getAvailableZoneIds().contains(zoneIdInput)) {
	            ZoneId zoneId = ZoneId.of(zoneIdInput);
	            ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
	            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
	            String formattedDateTime = zonedDateTime.format(formatter);
	            System.out.println("Current date and time in " + zoneIdInput + ": " + formattedDateTime);
	        } else 
	            System.out.println("Invalid zone ID. Please provide a valid zone ID.");
	    }
	}

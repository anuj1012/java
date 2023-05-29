import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class TimeConverter {
  public static void main(String[] args) {
    // Get country name from user input
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a country name: ");
    String countryName = scanner.nextLine();

    // Get timezone for country
    ZoneId timezone = ZoneId.of(getTimezoneForCountry(countryName));

    // Get current time in timezone
    ZonedDateTime currentTime = ZonedDateTime.now(timezone);

    // Print time in timezone
    System.out.println("Current time in " + countryName + " is " + currentTime);
  }

  private static String getTimezoneForCountry(String countryName) {
    // Map country names to timezone IDs
    switch (countryName) {
      case "United States":
        return "America/New_York";
      case "United Kingdom":
        return "Europe/London";
      case "Japan":
        return "Asia/Tokyo";
      default:
        throw new IllegalArgumentException("Invalid country name");
    }
  }
}
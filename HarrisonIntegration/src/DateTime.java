
//Harrison Paxton
// This program formats and prints the local date and time
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import static java.time.temporal.TemporalAdjusters.*;

public class DateTime {

  public static void dateTimeMain() {
    LocalDate currentDate = LocalDate.now();
    LocalTime currentTime = LocalTime.now();

    System.out.println("date/time creation: currentDate: " + currentDate);
    System.out.println("date/time creation: currentTime: " + currentTime);

  }

}

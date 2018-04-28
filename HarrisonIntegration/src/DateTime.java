
//Harrison Paxton
// This program formats and prints the local date and time

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 * @author harrisonpaxton
 *
 */
public class DateTime {

  public static void dateTimeMain() {

    LocalDate currentDate = LocalDate.now();
    LocalTime currentTime = LocalTime.now();

    System.out.println("date/time creation: currentDate: " + currentDate);
    System.out.println("date/time creation: currentTime: " + currentTime);

  }

}

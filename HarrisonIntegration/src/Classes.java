//Harrison Paxton
//This code is to fulfill the class requirement for PSI 1

//The code ask for an input of bike speed and outputs a sentence
//stating the given bike speed.
import java.util.Scanner;

/**
 * Classes class.
 * 
 * @author harrisonpaxton
 *
 */
public class Classes {

  /**
   * The code ask for an input of bike speed and outputs a sentence
   * stating the given bike speed.
   */
  public static void classesMain() {
    Scanner scan = new Scanner(System.in);

    Bicycle myBike = new Bicycle();
    System.out.println("Enter bike speed:");
    int speed = scan.nextInt();
    myBike.setSpeed(speed);
    System.out.println("The bike is going " + myBike.getSpeed() + " mph.");
  }
}


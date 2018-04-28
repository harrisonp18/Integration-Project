
//Harrison Paxton
//This code fulfills the method requirements for PSI 1
//This code calculates the area of a circle when given radius as an 
//input from the user

import java.util.Scanner;

/**
 * Methods class.
 * 
 * @author harrisonpaxton
 *
 */
public class Methods {
  /**
   * Asks for radius and prints area.
   */
  public static void methodsMain() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to the Circle Area Calculator!");
    System.out.println("Enter the radius of your circle:");
    // line
    double radius = scan.nextDouble();
    double area;
    area = calculateArea(radius); // this line is the call
    // "radius" in parenthesis is the argument
    System.out.println("The area of your circle is " + area);
  }

  /**
   * Calculates area from given radius.
   * @param radius calculates radius of circle
   * @return returns the calculated radius
   */
  public static double calculateArea(double radius) { // this line
    // is the header, "radius" in the parenthesis is the parameter
    double rad = radius;
    return Math.PI * rad * rad;
  }
}

// Static means belonging to class not belonging to the object
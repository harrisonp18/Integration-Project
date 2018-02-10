//This code fulfills the method requirements for PSI 1

import java.util.Scanner;
//This code calculates the area of a circle when given radius as an 
//input from the user
public class Methods {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to the Circle Area Calculator!");
    System.out.println("Enter the radius of your circle:");
    //line 
    double radius = scan.nextDouble();
    double area;
    area = calculateArea(radius); //this line is the call
    //"radius" in parenthesis is the argument
    System.out.println("The area of your circle is " + area);
  }
  
  public static double calculateArea(double radius) { //this line
    //is the header, "radius" in the parenthesis is the parameter
    double rad = radius;
    return Math.PI * rad * rad;
  }
}
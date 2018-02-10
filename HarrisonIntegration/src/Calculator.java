//This codes is a calculator where you enter 2 whole numbers and pick an 
//operation to be completed on them.
import java.util.Scanner;

public class Calculator {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
//Below is code that uses +, -, *, /, and %
//I also cast the inputed integers to double to receive precise answers
    System.out.println("This is a whole number calculator!");
    
    System.out.println("Enter a whole number:");
    int integer1 = scan.nextInt();
    double num1 = integer1; //casting example 1
    
    System.out.println("Enter another whole number:");
    int integer2 = scan.nextInt();
    double num2 = integer2; //casting example 2
    
    System.out.println("What operation would you like to complete using"
        + " these numbers? (+, -, *, /, or %)");
    String operation = scan.next();
    
    double endValue;
    
    if (operation.equals ("+")) {
      endValue = num1 + num2;
      System.out.println(num1 + operation + num2 + "=" + endValue);
    } else if (operation.equals ("-")) {
      endValue = num1 - num2;
      System.out.println(num1 + operation + num2 + "=" + endValue);
    }  else if (operation.equals ("*")) {
      endValue = num1 * num2;
      System.out.println(num1 + operation + num2 + "=" + endValue);
    } else if (operation.equals ("/")) {
      endValue = num1 / num2;
      System.out.println(num1 + operation + num2 + "=" + endValue);
    } else if (operation.equals ("%")) {
      endValue = num1 % num2;
      System.out.println(num1 + operation + num2 + "=" + endValue);
    } else {
      System.out.println("Error");
    }
    
      
  }
  
}

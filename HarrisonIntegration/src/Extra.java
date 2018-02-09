import java.util.Scanner;

public class Extra {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
//Below is code that uses +, -, *, /, and %
    System.out.println("This is a calculator!");
    
    System.out.println("Enter a number:");
    double num1 = scan.nextDouble();
    
    System.out.println("Enter another number:");
    double num2 = scan.nextDouble();
    
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



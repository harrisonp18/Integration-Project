import java.util.Scanner;
//Harrison Paxton
//This program gets the sum of an array

public class Sum {
 
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter Three Numbers: ");
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int sum = 0;

    int[] ar = { a, b, c };

    for (int counter = 0; counter < ar.length; counter++) {
      sum += ar[counter];
    }
    System.out.println("The sum of your numbers is: " + sum);
  }
}

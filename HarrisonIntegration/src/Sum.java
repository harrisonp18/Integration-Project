import java.util.Scanner;
//Harrison Paxton
//This program gets the sum of an array, using a for-each loop

/**
 * @author harrisonpaxton
 *
 */
public class Sum {

  public static void sumMain() {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter Three Numbers: ");
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int sum = 0;

    int[] ar = { a, b, c };

    int result = 0;
    for (int i : ar) {
      result += i;
    }
    System.out.println("The sum of your numbers is: " + result);
  }
}

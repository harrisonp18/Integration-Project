
//Harrison Paxton
//This program finds the smallest value in an array and returns it and its index
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author harrisonpaxton
 *
 */
public class Smallest {

  public static void smallestMain() {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter Three Numbers: ");
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int sum = 0;

    int[] ar = { a, b, c };
    int smallest = ar[0];

    for (int i = 1; i < ar.length; i++) {
      if (ar[i] < smallest) {
        smallest = ar[i];
      }
    }
    System.out.println("Smallest Number: " + smallest);
    System.out.println("Index of Smallest Number: " + findIndex(ar, smallest));

  }

  public static int findIndex(int[] ar, int s) {
    if (ar == null) {
      return -1;
    }
    int len = ar.length;
    int i = 0;
    while (i < len) {
      if (ar[i] == s) {
        return i;
      } else {
        i = i + 1;
      }
    }
    return i;
  }
}
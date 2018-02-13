
//Harrison Paxton
//This code fulfills the string manipulation requirements for PSI 1
import java.util.Scanner;

public class Strings {
  /*
   * This program asks a user for a word, uses trim method to trim it in case
   * user used spaces or multiple words, restates their word to them, prints it
   * in all uppercase and all lowercase, and tells the user what the first
   * letter of their word is.
   */

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a word:");
    String word = scan.next();

    char firstLetter = word.charAt(0);

    System.out.println("Your word is " + word.trim());
    System.out.println("The first letter of you word is " + firstLetter);
    System.out.println("Uppercase: " + word.toUpperCase());
    System.out.println("Lowercase: " + word.toLowerCase());
  }
}
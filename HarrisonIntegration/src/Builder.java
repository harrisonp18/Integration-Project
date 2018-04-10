import java.util.Scanner;
//Harrison Paxton
//This program demonstrates three methods of the String Builder class

public class Builder {

  public static void builderMain() {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a word:");
    String userString = scan.next();
    StringBuilder userS = new StringBuilder(userString);

    userS.reverse();
    System.out.println("Your Input Backwards: " + userS);

    System.out.println("Enter a second word: ");
    String userString2 = scan.next();

    userS.append(userString2);
    System.out.println(
        "Your second word has been appended to your" + " first: " + userS);

    int space = userString.length();
    userS.insert(space, " ");
    System.out.println("A space was added in the middle: " + userS);
  }
}

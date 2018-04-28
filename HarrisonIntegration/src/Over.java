
//Harrison Paxton
// This code provides an example of an overridden method (override)
//Soccer extends sports and overrides its methods, changing what they
//output
import java.util.Scanner;

public class Over {
  public static void overMain() {
    Sports c1 = new Sports();
    Soccer c2 = new Soccer();
    System.out.println(c1.getName());
    c1.getNumberOfTeamMembers();
    System.out.println(c2.getName());
    c2.getNumberOfTeamMembers();
  }

}

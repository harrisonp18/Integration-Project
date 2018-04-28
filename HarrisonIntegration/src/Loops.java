//Harrison Paxton
//this program has two counters to 10, one using a for loop, the other using while
/**
 * Loops class.
 * 
 * @author harrisonpaxton
 *
 */
class Loops {
  public static void loopsMain() {
    int count = 1;
    while (count < 11) {
      System.out.println("'While'Count is: " + count);
      count++;
    }
    for (int i = 1; i < 11; i++) {
      System.out.println("'For'Count is: " + i);
    }

  }
}

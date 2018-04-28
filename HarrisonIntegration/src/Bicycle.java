//Harrison Paxton
//Part of Classes program
/**
 * @author harrisonpaxton
 *
 */
public class Bicycle {
  private int speed;

  public Bicycle(int startSpeed) {
    speed = startSpeed;
  }

  public Bicycle() {
    speed = 0;
  }

  public int getSpeed() {
    return speed;
  }

  public int setSpeed(int s) {
    speed = s;
    return s;
  }

  public void printDescription() {
    System.out.println("The " + "Bike is going" + getSpeed() + " mph.");
  }
}
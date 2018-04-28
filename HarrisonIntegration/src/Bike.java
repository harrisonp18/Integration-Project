//Harrison Paxton
/**
 * @author harrisonpaxton
 *
 */
public class Bike {
  private int speed;

  public Bike(int startSpeed) {
    speed = startSpeed;
  }

  public Bike() {
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
    System.out.println("The Bike is going " + speed + " mph");
  }
}

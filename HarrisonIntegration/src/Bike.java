//Harrison Paxton
public class Bike {
  private int speed;
  private int cadence;

  public Bike(int startSpeed, int startCadence) {
    speed = startSpeed;
    cadence = startCadence;
  }

  public Bike() {
    speed = 0;
    cadence = 10;
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

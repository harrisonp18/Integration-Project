//Harrison Paxton
/**
 * @author harrisonpaxton
 *
 */
public class Car {

  private int speed;
  private String make;

  public Car() {
    speed = 0;
    make = "unknown";
  }

  public Car(int speed, String make) {
    this.speed = speed;
    this.make = make;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public int getSpeed() {
    return speed;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getMake() {
    return make;
  }

}

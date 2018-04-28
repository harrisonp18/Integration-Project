//Harrison Paxton
/**
 * Road bike class.
 * 
 * @author harrisonpaxton
 *
 */
public class RoadBike extends Bike {
  // In millimeters (mm)
  private int tireWidth;

  public RoadBike(int startSpeed, int startGear, int newTireWidth) {
    super(startSpeed);
    this.setTireWidth(newTireWidth);
  }

  public int getTireWidth() {
    return this.tireWidth;
  }

  public void setTireWidth(int newTireWidth) {
    this.tireWidth = newTireWidth;
  }

  /**
   * Method prints description.
   */
  public void printDescription() {
    super.printDescription();
    System.out
        .println("The RoadBike" + " has " + getTireWidth() + " MM tires.");
  }
}
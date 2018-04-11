//Harrison Paxton
public class RoadBike extends Bike {
  // In millimeters (mm)
  private int tireWidth;

  public RoadBike(int startCadence, int startSpeed, int startGear,
      int newTireWidth) {
    super(startCadence, startSpeed);
    this.setTireWidth(newTireWidth);
  }

  public int getTireWidth() {
    return this.tireWidth;
  }

  public void setTireWidth(int newTireWidth) {
    this.tireWidth = newTireWidth;
  }

  public void printDescription() {
    super.printDescription();
    System.out
        .println("The RoadBike" + " has " + getTireWidth() + " MM tires.");
  }
}
//Harrison Paxton
public class MountainBike extends Bike {
  private String suspension;

  public MountainBike(int startCadence, int startSpeed, String suspensionType) {
    super(startCadence, startSpeed);
    this.setSuspension(suspensionType);
  }

  public String getSuspension() {
    return this.suspension;
  }

  public void setSuspension(String suspensionType) {
    this.suspension = suspensionType;
  }

  public void printDescription() {
    super.printDescription();
    System.out.println(
        "The " + "MountainBike has a " + getSuspension() + " suspension.");
  }
}

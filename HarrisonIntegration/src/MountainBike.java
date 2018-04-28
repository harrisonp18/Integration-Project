//Harrison Paxton
/**
 * Mountain Bike class.
 * 
 * @author harrisonpaxton
 *
 */
public class MountainBike extends Bike {
  private String suspension;

  public MountainBike(int startSpeed, String suspensionType) {
    super(startSpeed);
    this.setSuspension(suspensionType);
  }

  public String getSuspension() {
    return this.suspension;
  }

  public void setSuspension(String suspensionType) {
    this.suspension = suspensionType;
  }


  /**
   *  Method prints description.
   */
  public void printDescription() {
    super.printDescription();
    System.out.println(
        "The " + "MountainBike has a " + getSuspension() + " suspension.");
  }
}

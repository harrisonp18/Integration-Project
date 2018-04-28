//Harrison Paxton
/*Using Bike, MountainBike, and RoadBike classes this program shows 
 * polymorphism in action. Refer to the various classes to see changes
  made.*/
/**
 * @author harrisonpaxton
 *
 */
public class Polymorphism {

  public static void polymorphismMain() {
    Bike bike01;
    Bike bike02;
    Bike bike03;

    bike01 = new Bike(10);
    bike02 = new MountainBike(10, "Dual");
    bike03 = new RoadBike(20, 8, 23);

    bike01.printDescription();
    bike02.printDescription();
    bike03.printDescription();

  }

}

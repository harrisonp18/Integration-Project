//Harrison Paxton
/*Using Bike, MountainBike, and RoadBike classes this program shows 
 * polymorphism in action. Refer to the various classes to see changes
  made.*/
public class Polymorphism {

  public static void polymorphismMain() {
    Bike bike01, bike02, bike03;

    bike01 = new Bike(20, 10);
    bike02 = new MountainBike(20, 10, "Dual");
    bike03 = new RoadBike(40, 20, 8, 23);

    bike01.printDescription();
    bike02.printDescription();
    bike03.printDescription();

  }

}

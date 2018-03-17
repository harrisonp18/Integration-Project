//Harrison Paxton
//This code is to fulfill the class requirement for PSI 1

//The code ask for an input of bike speed and outputs a sentence
//stating the given bike speed.
import java.util.Scanner;

public class Classes {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    Bicycle myBike = new Bicycle();
    System.out.println("Enter bike speed:");
    int speed = scan.nextInt();
    myBike.setSpeed(speed);
    System.out.println("The bike is going " + myBike.getSpeed() + " mph.");
  }
}

class Bicycle {
  private int speed;
  private int cadence;

  public Bicycle(int startSpeed, int startCadence) {
    speed=startSpeed;
    cadence=startCadence;
  }
  public Bicycle() {
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
}
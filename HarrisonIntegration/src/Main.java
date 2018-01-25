import java.util.Scanner;

//Harrison Paxton
//My project that integrates all the skills I've learned.
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello World!");
		//sysout ctrl+space
		
		System.out.println("What is your name?");
		String userName = scan.nextLine();
		
		System.out.println("Enter x1");//prompt for input
		int x1 = scan.nextInt();//get in input
		
		System.out.println("Enter rate");//prompt
		double rate = scan.nextDouble();
		
		Dog spot = new Dog();
		spot.size = 30;
		Dog spuds = new Dog();
		spuds.size = 40;
		
	}

}

class Dog {
	double size;
}
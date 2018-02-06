import java.util.Scanner;

//Harrison Paxton
//Integration Project
//My project that integrates all the skills I've learned. This project 
//will tell you the weight of something on any planet in our solar 
//system.

//A variable is a location in memory or a placeholder for something such
//as a primitive data type (int, double, etc.)

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Solar System Weight Scale!");
		//sysout ctrl+space
	
		System.out.println("Enter a weight (lbs):");
		int userWeight = scan.nextInt();
		
		System.out.println("Pick a planet:");//prompt for input
		scan.nextLine();
		String planet = scan.nextLine();//get in input
		
		double planetWeight = 0;
		
		switch (planet) {
		  case "Mercury":
				planetWeight = userWeight*0.38;
				break;
			case "Venus":
				planetWeight = userWeight*0.91;
				break;
			case "Mars":
				planetWeight = userWeight*0.38;
				break;
			case "Jupiter":
				planetWeight = userWeight*2.34;
				break;
			case "Saturn":
				planetWeight = userWeight*1.06;
				break;
			case "Neptune":
				planetWeight = userWeight*0.92;
				break;
			case "Uranus":
				planetWeight = userWeight*1.19;
				break;
			default:
			   System.out.println("Error: That is not a planet!");
		}
		
		System.out.println(userWeight + " lbs on Earth is equivalent to " + 
        planetWeight + " lbs on " + planet + ".");
	}

}

//
//Dividing two integers always results in an integer.
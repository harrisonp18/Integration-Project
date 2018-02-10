import java.util.Scanner;

/*Harrison Paxton
Integration Project
My project that integrates all the skills I've learned. This project 
will tell you the weight of something on any planet in our solar 
system. Other code non-related to my conversion program is below as 
to demonstrate other things I've learned that couldn't be usefully
implemented into my primary program


A variable is a location in memory or a placeholder for something such
as a primitive data type (int, double, etc.)
byte: 8-bit signed two's complement integer
short: 16-bit signed two's complement integer
int: 32-bit signed two's complement integer
long: 64-bit signed two's complement integer
float: single-precision 32-bit IEEE 754 floating point
double: single-precision 64-bit IEEE 754 floating point
boolean: only two possible values, true or false
char: single 16-bit Unicode character*/

public class Main {
/*This is the beginning of my weight conversion code. It is rough at the
 moment but will be modified as time goes on. */
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

/*The rest of my code is in the other files
 * Calculator.java has all arithmetic operators
 * Classes.java has a class, object, getter and setter
 * Methods.java has a method declared and invoked
 */

//REMEMBER: Dividing two integers always results in an integer.
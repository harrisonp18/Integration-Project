import java.util.Scanner;

//Harrison Paxton
//My project that integrates all the skills I've learned.

//A variable is a location in memory or a placeholder for something such as a primitive data type (int, double, etc.)
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello!");
		//sysout ctrl+space
		
		System.out.println("What is your name?");
		String userName = scan.nextLine();
		
		System.out.println("How old are you?");//prompt for input
		int age = scan.nextInt();//get in input
		
		System.out.println("Your name is " + userName + " and you are " + age + " years old.");//prompt
		
		
	
		
	}

}

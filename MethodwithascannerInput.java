import java.util.Scanner;
import java.util.ArrayList;
public class MethodwithascannerInput {

	public static void main(String[] args) {
		System.out.println("Hello Please type Red, Blue, or Green if you can read this message.");
		Scanner scnr = new Scanner(System.in);
		String userInput;
		userInput = scnr.next();
		int colorsNum = 4;
		ArrayList colors = new ArrayList();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		
		try {
		if(userInput.equals("Red")) {
		System.out.println(colors.get(0));	
		System.out.println("Success!");
		}	
		else if(userInput.equals("Blue")) {
			System.out.println(colors.get(1));
			System.out.println("Success!");
			userInput = scnr.next();
		}
		else if(userInput.equals("Green")) {
			System.out.println(colors.get(2));
			System.out.println("Success!");
			userInput = scnr.next();
		}
		else if(userInput == userInput) {
			System.out.println(colors.get(4));
		}
		}
		catch(Exception e) {
			System.out.println("Failure!");
			userInput = scnr.next();
		}
	
}	
}
	
	
	


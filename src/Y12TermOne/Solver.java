package Y12TermOne;

import java.util.Scanner;

public class Solver {

	public static void main(String[] args) { 
		boolean check = false; //setting boolean to be false
		int n = 0; //making the int variable n set to 0
		int max = 1000; //making the int variable max set to 1000
		int min = 1; //making the int variable min set to 1
		Scanner userInput = new Scanner(System.in);  //declare scanner
		String user = ""; //making an empty string
		System.out.println("I will guess the number you are thinking, you will tell me higher or lower."); //telling the user the instructions
		System.out.println("Print H for higher, L for lower and C for correct"); //telling the user the instructions
		while (check == false) { //while the check is false run this loop 
			n = (int) (max + min) / 2; //this generates a new number 
			System.out.println("Is your number: " + n); //asks user if its their number
			user = userInput.nextLine(); //get the user input 
			if (user.equals("H") || user.equals("h")) { //check the user input if it is equal to H or h run this if statement
				min = n; //change the lower bound
			} //end of if statement
			if (user.equals("L") || user.equals("l")) { //check the user input if it is equal to L or l run this if statement
				max = n; //change the upper bound
			} //end of statement
			if (user.equals("C") || user.equals("c")) { //check the user input if it is equal to C or c run this if statement
				check = true; // make check equal to true
			} // end of if statement
		} //end of while loop
	} //end of main
} //end of class

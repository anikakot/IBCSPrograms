package Y12TermOne;

import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		boolean check = false; //setting boolean check to be false
		String insults[] = {"you're so stupid HAHA","how dense are you?","you imbecile","you peabrain!!","5","6","7","8"}; //the range of insults
		int randomNum = (int) (Math.random() * 1000) + 1; // this is the range of numbers for a random number
		double user = 0; // this is what the user is guessing
		Scanner userInput = new Scanner(System.in); //declaring the scanner
		System.out.println("You have ten tries to guess a random number within 1 and a 1000"); //outputting the condition to the user

		for (int i = 1; i < 11; i++) { //loop to make the ten tries
			System.out.println("Guess no. " + i); //making the user guess a number
			user = userInput.nextInt(); //moving on to next position of i 
			if (user == randomNum) { //if the user guesses the random number
				System.out.println("you guessed correctly"); //this will tell the user they guessed correctly 
				i = i+10;
				check = true;
			} //end of if statement
			if (user>randomNum) { //if the user guesses above the random number
				System.out.println("Guess a lower number"); //this will tell the user they guessed too high
			} //end of if statement
			if (user<randomNum) { //if the user guesses below the random number
				System.out.println("Guess a higher number"); //this will tell the user they guessed too low
			} //end of if statement
			if (i>7 && check == false) { //if there has been more than 7 guesses
				System.out.println(insults[(int )(Math.random()* 8)]); //a random insult will be generated
			} // end of if statement
		} // end of for loop
	} // end of main
} // end of class

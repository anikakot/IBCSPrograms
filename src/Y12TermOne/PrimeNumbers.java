package Y12TermOne;

public class PrimeNumbers {

	public static void main(String[] args) {

		System.out.print(primeFactors(156));

	} // end main

	public static String primesBetween(long N, long N2) { // concatenate / find all prime numbers between N and N2
		String output = "";
		long firstPrime = nextPrime(N);
		if (firstPrime >= N2) {
			return "";
		}
		output = "" + firstPrime;

		for (long i = firstPrime + 1; i < N2; i++) {
			if (isPrime(i)) {
				output = output + "," + i;
			}
		}
		return output;
	} // end of function

	public static long previousPrime(long N) {
		long i = N - 1;
		while (isPrime(i) == false) {
			i--;
		} // end of main
		return i; //
	} // end of function

	// this function finds the first prime number after N
	public static long nextPrime(long N) {
		long i = N + 1;
		while (isPrime(i) == false) {
			i++;
		}
		return i;
	} // end of function
		// this function returns true if N is a prime number and false if N is not a
		// prime number

	public static boolean isPrime(long N) {
		if (N <= 1) {
			return false;
		}
		long squareRootN = ((long) java.lang.Math.sqrt(N)) + 1;

		for (long i = 2; i < squareRootN + 1; i++) {
			if ((N % i) == 0) {
				return false;
			} // end if
		} // end for loop
		return true;

	} // end function isPrime ()

	
	// the method outputs the prime factors of a number
	
	public static String primeFactors(long N) { // declares the method name and parameter and a return type  
				
		long currentPrimeFactor = 2; // declare the variable and set it to 2
		String returnString = ""; //declares a string variable and assigns an empty string to it
		while (N != 1) { // while N is not equal to 1 run this loop 
			if ((N % currentPrimeFactor) == 0) { // if N is divisible by the current prime factor this if statement, the code inside the body of this if statement will execute
				N = N / currentPrimeFactor; //this divides N by the current prime factor and sets it to be the new N
				returnString = returnString + "x" + currentPrimeFactor ; //this appends current prime factor to the return string
			} // end of if body

			else { //executes if the test expression is false
				currentPrimeFactor = nextPrime(currentPrimeFactor); //Assigns the next prime number to be the new currentprimefactor 
			} //end of else body 
		} //end of while loop 
		
		return returnString.substring(1, returnString.length()); //this cuts of the first character of the returnstring and then returns it to the caller 

	} //end of method

} // end of class

/*
 * find first primes first N primes find prime factors string primeFactors (long
 * N) decomposition
 */

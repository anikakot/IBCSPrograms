package Y12TermOne;

public class PrimeNumbers {

	public static void main(String[] args) {

		System.out.print(primesBetween(5, 20));

	} // end main

	public static String primesBetween(long N, long N2) { 			//concatenate / find all prime numbers between N and N2
		String output = "";
		long firstPrime = nextPrime(N);
		if(firstPrime >= N2) {
			return "";
		}	
		output = ""+firstPrime;
		
		for (long i = firstPrime+1; i < N2; i++) 
		{
			if (isPrime(i)) 
			{
				output = output +"," + i;				
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
		for (long i = 2; i < N; i++) {
			if ((N % i) == 0) {
				return false;
			} // end if
		} // end for loop
		return true;
	} // end function isPrime ()

} // end of class

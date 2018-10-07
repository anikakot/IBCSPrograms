package Y12TermOne;

public class MathematicalFunctions {

	public static void main(String[] args) {

	}

	public static double abs(double N) {
		if (N < 0) {
			return -N;
		} else {
			return N;

		}
	}
	public static double min (double a,double b) {
		if (a<b) {
			return a;
		}else {
			return b;
		} // end of else
	} // end of if
	
	public static double max (double a,double b) {
		if (a>b) {
			return a;
		}else {
			return b;
		} // end of else
	} // end of if
		
	
	
}

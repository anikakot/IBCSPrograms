package Y12TermOne;

public class romanNumbers {

	public static void main(String[] args) {
		System.out.println(roman(270));
	}

	public static String roman(int N) {

		if (N > 3999) {
			return ("this input is not valid");

		}

		String answer = "";
		while (N >= 1000) {
			answer = answer + "M";
			N = N - 1000;
		}

		if (N > 99) {
			if (N / 100 == 4) {
				answer = answer + "CD";
				N = N - 400;
			} else if (N / 100 == 9) {
				answer = answer + "CM";
				N = N - 900;
			} else {
				if (N > 499) {
					answer = answer + "D";
					N = N - 500;
				}
			}

			while (N > 99) {
				answer = answer + "C";
				N = N - 100;
			}
		}

		if (N > 9) {
			if (N / 10 == 4) {
				answer = answer + "XL";
				N = N - 40;
			} else if (N / 10 == 9) {
				answer = answer + "XC";
				N = N - 90;
			} else {
				if (N > 49) {
					answer = answer + "L";
					N = N - 50;
				}
			}

			while (N > 9) {
				answer = answer + "X";
				N = N - 10;
			}
		}

		if (N > 0) {
			if (N == 4) {
				answer = answer + "IV";
				N = N - 4;
			} else if (N == 9) {
				answer = answer + "IX";
				N = N - 9;
			} else {
				if (N > 4) {
					answer = answer + "V";
					N = N - 5;
				}
			}

			while (N > 0) {
				answer = answer + "I";
				N = N - 1;
			}
		}

		return answer;
	}

}

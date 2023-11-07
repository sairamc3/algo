import java.util.*;
import java.util.stream.*;

class FactorialRecursive {

	public static void main(String args[]) {

		int given = 6;
		if (args.length != 0) {
			given = Integer.valueOf(args[0]);
		}
		System.out.println("Factorial of number " + given);

		System.out.println(factorial(given));

	}

	// Recursive approach for factorial
	private static int factorial(int number) {

		if (number == 2)
			return number;

		return number * factorial(number - 1);

	}

}

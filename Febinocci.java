import java.util.*;
import java.util.stream.*;

class Febinocci {

	public static void main(String args[]) {

		int given = 6;
		if (args.length != 0) {
			given = Integer.valueOf(args[0]);
		}
		System.out.println("Febinocci series for  " + given);

		System.out.println("Recursive ->  " + recursive(given));
		System.out.println("Iterative -> ");
		System.out.println(iterative(given));

	}

	// Recursive approach for factorial
	// Looks simple but more complex
	// O(2^n)
	private static int recursive(int number) {
		if(number<2) return number;
		return recursive(number-1) + recursive(number-2);

	}
	
	// O(n)
	// Result will be obtained in one iteration
	private static int iterative(int number){
		
		int prev=0;
		int current=1;
		int add =0;
		for(int i=1; i<=number; i++){
			
			System.out.print(prev + " ,");
			add = current+prev;
			prev=current;
			current=add;
				
		
		}
	return prev;
	}

}

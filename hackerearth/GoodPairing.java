import java.io.*;
import java.util.*;

public class GoodPairing {


	// Pair of numbers in the array which satisfy 
	// arr[i]=arr[j]
	// i<j
	// Find the no of. good pairs in the array
	public static void main(String[] args) throws IOException {

		int[] given = {1, 2, 3, 1, 1, 3};

		// solution
		// no matter the order for the combination of the numbers in the array 
		// the no of good pairs would be same
		// Hence find the no of repeated numbers in the array 
		// for ex: there are 3  1's in the array
		// no of good pairs would be 
		// (0,3),(0,4),(3,4). -> 4
		// there are 2 3's in the array
		// (2,5) -> 1
		// The formula for each no of entities is 
		// 1+2+3+... (n-1) = n * (n-1)/2
		// According to above formula
		// 1 -> 3 => 3*2/2 = 3
		// 2 -> 1 => 1* 0/2 = 0
		// 3 -> 2 => 2* 1/2 = 1
		//                  -----
		//                    4
		//                  -----

	// Hence applying the above logic in the code

		System.out.println(findGoodPairs(given));

	}

	private static int findGoodPairs(int[] given){

		int result = 0;

		Map<Integer, Integer> count = new HashMap<>();

		for(int i=0; i<given.length; i++){

			if(count.containsKey(given[i])){
				count.put(given[i], count.get(given[i])+1);
			} else {
				count.put(given[i],1);
			}
		}

		for(Map.Entry element:count.entrySet()){

			int n = (int)element.getValue();

			result = result + n*(n-1)/2; 
		}

		return result;
	}

}
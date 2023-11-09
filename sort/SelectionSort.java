import java.util.*;
import java.util.stream.*;

class SelectionSort {

	public static void main(String args[]) {

		int[] arr = { 500, 62, 71, 22, 2, 3, 4, 10, 400 };

		String givenArrayInString = Arrays.stream(arr)
				.mapToObj(String::valueOf)
				.collect(Collectors.joining(", ", "{", "}"));
		System.out.println(givenArrayInString);

		selectionSort(arr);

		System.out.println("After Sorting");

		String afterSorting = Arrays.stream(arr)
				.mapToObj(String::valueOf)
				.collect(Collectors.joining(", ", "{", "}"));
		System.out.println(afterSorting);

	}

	/**
	 * Complexity O(n^2)
	 * Space Complexity O(1)
	 * 
	 * We are not creating any new data structure and hence space complexity is less
	 * But for every case the computing complexity is O(n^2), which is not advised
	 * @param arr
	 */
	private static void selectionSort(int[] arr) {

		// This logic has to be fixed. Getting index out of bounds exception
		// Commiting for now

		for(int i=0; i<arr.length-1; i++){
			int min = i;
			int temp = arr[min];

			for(int j=i+1; i<arr.length; j++){

				if(arr[j]<arr[min]){
					min = j;
				}
			}

			arr[i]=arr[min];
			arr[min]=temp;
		}

	}

}

import java.util.*;
import java.util.stream.*;

class BinaryRecursiveSearch {

	public static void main(String args[]) {

		int[] arr = { 500, 62, 71, 22, 2, 3, 4, 10, 400 };

		String givenArrayInString = Arrays.stream(arr)
				.mapToObj(String::valueOf)
				.collect(Collectors.joining(", ", "{", "}"));
		System.out.println(givenArrayInString);

		bubbleSort(arr);

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
	private static void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j + 1] < arr[j]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

}

import java.util.*;
import java.util.stream.*;

class BinaryIterativeSearch {

	public static void main(String args[]) {

		int[] arr = { 500, 62, 71, 22, 2, 3, 4, 10, 400 };

		// Sorting the array before sending it for search
		Arrays.sort(arr);

		String givenArrayInString = Arrays.stream(arr)
				.mapToObj(String::valueOf)
				.collect(Collectors.joining(", ", "{", "}"));
		System.out.println(givenArrayInString);
		int key = 71;
		System.out.println("key -> " + key);

		int index = binaryIterativeSearch(arr, arr.length, key);

		if (index == -1) {
			System.out.println("Key not found in the given array");
		} else {
			System.out.println("The key is found at the index -> " + index);
		}

	}

	// The array should be sorted before passing here for binary search
	private static int binaryIterativeSearch(int[] arr, int length, int key) {

		int left = 0;
		int right = length - 1;

		while (left <= right) {
			int middle = (left + right - 1) / 2;
			if (arr[middle] == key) {
				return middle;
			} else if (arr[middle] > key) {
				right = middle - 1;
			} else {
				left = middle + 1;
			}
		}

		return -1;

	}

}

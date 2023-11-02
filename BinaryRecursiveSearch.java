import java.util.*;
import java.util.stream.*;

class BinaryRecursiveSearch {

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

		int index = binaryRecursiveSearch(arr, 0, arr.length - 1, key);

		if (index == -1) {
			System.out.println("Key not found in the given array");
		} else {
			System.out.println("The key is found at the index -> " + index);
		}

	}

	// The array should be sorted before passing here for binary search
	private static int binaryRecursiveSearch(int[] arr, int left, int right, int key) {

		while (left <= right) {
			int middle = (left + right - 1) / 2;
			if (arr[middle] == key) {
				return middle;
			} else if (arr[middle] > key) {
				return binaryRecursiveSearch(arr, left, middle - 1, key);
				// right=middle-1;
			}
			return binaryRecursiveSearch(arr, middle + 1, right, key);
			// left=middle+1;

		}

		return -1;

	}

}

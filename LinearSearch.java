import java.util.*;
import java.util.stream.*;

class LinearSearch {

	public static void main(String args[]) {

		int[] arr = { 2, 3, 4, 10, 400 };

		String givenArrayInString = Arrays.stream(arr)
				.mapToObj(String::valueOf)
				.collect(Collectors.joining(", ", "{", "}"));
		System.out.print(givenArrayInString);
		int key = 400;
		System.out.println("key -> " + key);

		int index = linearSearch(arr, arr.length, key);

		if (index == -1) {
			System.out.println("Key not found in the given array");
		} else {
			System.out.println("The key is found at the index -> " + index);
		}

	}

	private static int linearSearch(int[] arr, int length, int key) {

		for (int i = 0; i < length; i++) {
			if (key == arr[i]) {
				return i;
			}
		}
		return -1;

	}

}

import java.util.*;
import java.util.stream.*;

class SentinalLinearSearch {

	public static void main(String args[]) {

		int[] arr = { 2, 3, 4, 10, 400 };

		String givenArrayInString = Arrays.stream(arr)
				.mapToObj(String::valueOf)
				.collect(Collectors.joining(", ", "{", "}"));
		System.out.print(givenArrayInString);
		int key = 3;
		System.out.println("key -> " + key);

		int index = sentinalLinearSearch(arr, arr.length, key);

		if (index == -1) {
			System.out.println("Key not found in the given array");
		} else {
			System.out.println("The key is found at the index -> " + index);
		}

	}

	private static int sentinalLinearSearch(int[] arr, int length, int key) {

		int last = arr[length - 1];

		arr[length - 1] = key;
		int index = 0;

		while (arr[index] != key) {

			index++;
		}

		if (index < length - 1 || last == key) {
			return index;
		}

		return -1;

	}

}

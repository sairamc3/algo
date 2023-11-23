import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

public class MaximumBorders {

	public static void main(String[] args) throws Exception{

		System.out.println("MaximumBorders Process has started");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int noOfTestCases = Integer.parseInt(br.readLine());

		for(int testCase=0; testCase < noOfTestCases; testCase++){

			String[] firstLine= br.readLine().split(" ");

			int noOfRows = Integer.parseInt(firstLine[0]);
			int noOfColumns = Integer.parseInt(firstLine[1]);

			String[][] matrix = new String[noOfRows][noOfColumns];

			for(int row=0; row<noOfRows; row++){

				String[] columns = br.readLine().split("");

				for(int column=0; column<columns.length; column++){

					matrix[row][column]=columns[column];

				}
			}

			// Printing the data that has been fetched

			System.out.println("Printing the input:");

			Arrays.stream(matrix)
					.map(row -> String.join(" ", row))
					.forEach(System.out::println);

			int result=findMaximumBorder(matrix, noOfRows, noOfColumns);

		}

		


	}


	// Work in progress
	private static int findMaximumBorder(String[][] matrix, int rowSize, int columnSize){

		int boarder=0;

		for(int row=0; row< rowSize; row++){


			for(int column=0; column < columnSize; column++){


			}
		}
		return boarder;
	}
}
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

			int n = Integer.parseInt(firstLine[0]);
			int m = Integer.parseInt(firstLine[1]);

			String[] a = new String[n];

			for(int i=0; i<n; i++){

				a[i]=br.readLine();
			}

			
			
		}

		


	}


}
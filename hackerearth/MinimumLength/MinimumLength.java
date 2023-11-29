import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

class MinimumLength {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int noOfCases =Integer.parseInt(br.readLine()); 
        
        for (int caseNo = 0; caseNo < noOfCases; caseNo++){

            int lengthOfArray = Integer.parseInt(br.readLine());

            String[] a = br.readLine().split(" ");
            String[] b = br.readLine().split(" ");

            int leftIndex = 0;
            int rightIndex = lengthOfArray -1;

            for(int i=0; i<lengthOfArray; i++){

                if(a[i].equals(b[i])){
                    leftIndex = i;
                } else {
                    break;
                }

            }

            for(int r=lengthOfArray-1; r>=leftIndex; r--){

                if(a[r].equals(b[r])){
                    rightIndex = r;
                }  else {
                    break;
                }

            }

            int subArraySize = rightIndex - leftIndex;

            System.out.println(subArraySize);
        }

            
        }
        
       
      

}

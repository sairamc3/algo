/* IMPORTANT: Multiple classes and nested static classes are supported */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {

    public static void main(String args[] ) throws Exception {

        Map<Integer,Integer> segmentCount = new HashMap<>();
        segmentCount.put(0,6);
        segmentCount.put(1,2);
        segmentCount.put(2,5);
        segmentCount.put(3,5);
        segmentCount.put(4,4);
        segmentCount.put(5,5);
        segmentCount.put(6,6);
        segmentCount.put(7,3);
        segmentCount.put(8,7);
        segmentCount.put(9,6);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Reading the input
        int noOfCases =Integer.parseInt(br.readLine()) ; 
        
        for(int i=0; i<noOfCases; i++){

            String given = br.readLine();

            String[] individualGiven= given.split("");

            int noOfMatchSticks = 0;

            for(String number: individualGiven){

                noOfMatchSticks+=segmentCount.get(Integer.parseInt(number));
            }

            if(noOfMatchSticks%2==0){

                int noOfNumbers = noOfMatchSticks/2;

                for(int k=0; k<noOfNumbers; k++){

                    System.out.print("1");
                }
            } else {

                int noOfNumbers = (noOfMatchSticks/2)-1;

                System.out.print("7");

                for(int k=0; k<noOfNumbers; k++){

                    System.out.print("1");
                }

            }

            System.out.println("");

        }
        
       
    

    }
}

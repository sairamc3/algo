/* IMPORTANT: Multiple classes and nested static classes are supported */


import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class BestIndex {
    public static void main(String args[] ) throws Exception {
        

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int noOfCases =Integer.parseInt(br.readLine()) ; 
        
        String[] numbersAsStrings = br.readLine().split(" ");

        List<Integer> givenList = Arrays.stream(numbersAsStrings)
                                        .map(Integer::parseInt)
                                        .collect(Collectors.toList());

        List<Integer> specialsum = new ArrayList<>();

        for(int i=0; i<givenList.size(); i++){

            int noOfElementsCanBeSummed = givenList.size()-i;

            if(noOfElementsCanBeSummed == 1){
                specialsum.add(givenList.get(i));
            } else {
                int n=0;

                int shouldBeSummed = 0;
                while(n < (givenList.size()-n){
                    shouldBeSummed = n*(n+1)/2;
                    n++;
                }
            }
        }
        
       
    

    }
}

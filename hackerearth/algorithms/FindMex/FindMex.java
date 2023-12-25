
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;
import java.util.stream.*;


class FindMex {



    public static void main(String args[] ) throws Exception {
        

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sizeOfArray =Integer.parseInt(br.readLine()) ; 

        String arrayAsString = br.readLine();

        String[] inputAsString = arrayAsString.split(" ");

        List<Integer> inputList=Arrays.stream(inputAsString)
                                        .map(Integer::parseInt)
                                        .collect(Collectors.toList());
    
    

       

       // This method is a valid solution
       // But this is brute force approach and it is taking more time to execute.
       // So need to change the strategy 
       for(int i=0; i < inputList.size();i++){

            Integer mex = findMex(inputList.subList(0,i+1));
            System.out.print(mex + " ");
       }


        

    }

   
    private static Integer findMex(List<Integer> inputList){
    
        Integer mex = 0;

        Set<Integer> unsortedSet =inputList.stream().collect(Collectors.toSet());

        List<Integer> distinctList = unsortedSet.stream().collect(Collectors.toList());

        if(distinctList.get(0) != 0) {
            
            return mex;
        }

        for(int i=0; i<distinctList.size()-1; i++){
        
            if(distinctList.get(i+1)- distinctList.get(i) != 1){

                mex = distinctList.get(i)+1;
                return mex;
            }
        }

        
        mex = distinctList.get(distinctList.size()-1)+1;

        return mex;
    }
}

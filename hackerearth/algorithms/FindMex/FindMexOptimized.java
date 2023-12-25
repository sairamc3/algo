
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;
import java.util.stream.*;


class FindMex {

    private static Map<Integer, Integer> count = new HashMap<>();


    public static void main(String args[] ) throws Exception {
        

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sizeOfArray =Integer.parseInt(br.readLine()) ; 

        String arrayAsString = br.readLine();

        String[] inputAsString = arrayAsString.split(" ");

        List<Integer> inputList=Arrays.stream(inputAsString)
                                        .map(Integer::parseInt)
                                        .collect(Collectors.toList());
    
        addTheListToMap(inputList);

       

       // This method is a valid solution
       // But this is brute force approach and it is taking more time to execute.
       // So need to change the strategy 
       //for(int i=0; i < inputList.size();i++){

            //Integer mex = findMex(inputList.subList(0,i+1));
            //System.out.print(mex + " ");
       //}

       // Another approach
       // We need to do it only once, saves time. for the full list. 

        // The below solution did not work, need to find out why.
       Integer mexForWhole=findMex(inputList);

       List<Integer> resultList = new ArrayList<>(sizeOfArray);
       resultList.add(mexForWhole);

       

       for(int i=sizeOfArray-1; i > 0; i--){

        if(mexForWhole > i ){

            if(count.containsKey(mexForWhole) && count.get(mexForWhole) > 0){
                 Integer noOfInstances=count.get(mexForWhole);
                count.remove(mexForWhole);
                count.put(mexForWhole, noOfInstances-1);
                continue;
            }

            mexForWhole= inputList.get(i);

            
        } 
        resultList.add(mexForWhole);

       }

       
       // Print the reusult which should be in reverse order
       for(int result= resultList.size()-1; result>=0; result--){

        System.out.print(resultList.get(result) + " ");
       }

        

    }

    private static void addTheListToMap(List<Integer> inputList){

        for(Integer given:inputList){

            if(count.containsKey(given)){
                Integer noOfInstances=count.get(given);
                count.remove(given);
                count.put(given, noOfInstances+1);

            } else {
                count.put(given, 1);
            }
            
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

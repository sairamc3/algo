import java.io.*;
import java.util.*;

/**
 * Problem Solved
 */
public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         String[] arr_workload = br.readLine().split(" ");
         int[] workload = new int[N];
         for(int i_workload = 0; i_workload < arr_workload.length; i_workload++)
         {
         	workload[i_workload] = Integer.parseInt(arr_workload[i_workload]);
         }

         int out_ = solve(N, workload);
         System.out.println(out_);

         wr.close();
         br.close();
    }
    static int solve(int N, int[] workload){
       // Write your code here
        int result =0; 
        int current = 0;

        for(int wl: workload){

            //System.out.println(wl);

            if(wl >6){
                current++;
                //System.out.println("Incremented the current. Current -> " + current);
            } else if(current >= result){
                result=current;
                current=0;
                //System.out.println("The chain broke. Current -> " + current + ", result -> " + result);
            } else {
                current=0;
            }

            //System.out.println("--");
        }
        if(current>result){
            result=current;
            current=0;

            //System.out.println("End of array. Current -> " + current + ", result -> " + result);
        }


        return result;
    
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;

class MinimumLength {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int noOfCases = Integer.parseInt(br.readLine());

        for (int caseNo = 0; caseNo < noOfCases; caseNo++) {

            int lengthOfArray = Integer.parseInt(br.readLine());

            String[] a = br.readLine().split(" ");
            String[] b = br.readLine().split(" ");

            int leftIndex = -1;
            int rightIndex = -1;

            for (int i = 0; i < lengthOfArray; i++) {
                if (!a[i].equals(b[i])) {
                    leftIndex = i;
                    break;
                }
            }

            for (int r = lengthOfArray - 1; r >= 0; r--) {
                if (!a[r].equals(b[r])) {
                    rightIndex = r;
                    break;
                }
            }

            int subArraySize = (rightIndex - leftIndex) + 1; // Adjust the subarray size calculation

            System.out.println(subArraySize);
        }
    }
}

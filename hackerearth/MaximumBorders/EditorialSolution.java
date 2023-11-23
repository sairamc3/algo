import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());

        for (int t = 0; t < testCases; t++) {
            String[] input = scanner.nextLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);

            String[] a = new String[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLine();
            }

            int ans = 0;
            for (String line : concatenateArrays(a, rotateArray(a))) {
                int cur = 0;
                for (char x : line.toCharArray()) {
                    if (x == '#') {
                        cur++;
                        ans = Math.max(ans, cur);
                    } else {
                        cur = 0;
                    }
                }
            }
            System.out.println(ans);
        }
    }

    private static String[] rotateArray(String[] a) {
        int n = a.length;
        int m = a[0].length();
        String[] rotated = new String[m];

        for (int i = 0; i < m; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(a[j].charAt(i));
            }
            rotated[i] = sb.toString();
        }
        return rotated;
    }

    private static String[] concatenateArrays(String[] a, String[] b) {
        String[] concatenated = new String[a.length + b.length];
        System.arraycopy(a, 0, concatenated, 0, a.length);
        System.arraycopy(b, 0, concatenated, a.length, b.length);
        return concatenated;
    }
}

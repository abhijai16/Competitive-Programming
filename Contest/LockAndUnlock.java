import java.util.Arrays;
import java.util.Scanner;

public class LockAndUnlock{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            long[] arr = new long[n];

            long min = Long.MAX_VALUE;
            long max = Long.MIN_VALUE;

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextLong();

                min = Math.min(min, arr[i]);
                max = Math.max(max, arr[i]);
            }

            Arrays.sort(arr);

            long median = arr[n / 2];

            long cost = 0;

            for(int i = 0; i < n; i++){
                cost += Math.abs(arr[i] - median);
            }
            long operations = max - min;

            System.out.println(cost + " " + operations);
        }

        sc.close();
    }
}

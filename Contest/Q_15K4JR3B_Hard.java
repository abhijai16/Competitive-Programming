import java.util.Arrays;
import java.util.Scanner;

public class Q_15K4JR3B_Hard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            long[] arr = new long[n];
            long total = 0;

            for(int i = 0; i < n; i++){
                int a = sc.nextInt();

                arr[i] = 1L << a;
                total += arr[i];
            }

            Arrays.sort(arr);

            long target = total / 2;
            long x = 0;
            for(int i = n - 1; i >= 0; i--){
                if(x + arr[i] <= target){
                    x += arr[i];
                }
            }

            long y = total - x;

            System.out.println(x * y);
        }

        sc.close();
    }
}

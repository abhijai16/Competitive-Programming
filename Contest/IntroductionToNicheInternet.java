
import java.util.Arrays;
import java.util.Scanner;

public class IntroductionToNicheInternet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int maxFreq = 0;

            for(int i = n - 1; i >= 0; i--){
                if(arr[i] == arr[n - 1]){
                    maxFreq++;
                }
                else{
                    break;
                }
            }

            if(maxFreq > k){
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");

            for(int i = n - k; i < n; i++){
                System.out.print(arr[i] + " ");
            }

            for(int i = n - k - 1; i >= 0; i--){
                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}

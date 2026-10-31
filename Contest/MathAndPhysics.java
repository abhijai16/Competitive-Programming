import java.util.Scanner;

public class MathAndPhysics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            long sum = 0;
            int[] arr = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }

            boolean internal = false;

            for(int i = 1; i < n - 1; i++){
                if(arr[i] >= 2){
                    internal = true;
                    break;
                }
            }

            long ans;

            if(internal){
                ans = sum - 1;
            }
            else if(arr[0] >= 2 || arr[n - 1] >= 2){
                ans = sum - (n - 1);
            }
            else{
                ans = -1;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}

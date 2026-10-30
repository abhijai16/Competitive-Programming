import java.util.Arrays;
import java.util.Scanner;

public class Q_160A_Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int[] value = new int[total];
        int sum = 0;

        for(int i=0; i<total; i++){
            value[i] = sc.nextInt();
            sum += value[i];
        }

        Arrays.sort(value);
        int currSum = 0;
        int ans = 0;

        for(int i=total-1; i>=0; i--){
            if(currSum>sum-currSum){
                break;
            }
            currSum += value[i];
            ans++;
        }

        System.out.println(ans);

        sc.close();
    }
}

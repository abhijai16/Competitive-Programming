
import java.util.Scanner;

public class Q_158A_NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<k; i++){
            if(arr[i]>0){
                count++;
            }
        }
        int num = arr[k-1];
        if(count!=0 && num!=0){
            for(int i=k; i<arr.length; i++){
                if(arr[i]==num){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

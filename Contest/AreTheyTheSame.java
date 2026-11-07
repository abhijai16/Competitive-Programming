
import java.util.Scanner;

public class AreTheyTheSame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            for(int i = 0; i < n; i++){
                b[i] = sc.nextInt();
            }

            int oddA = 0;
            int oddB = 0;
            int evenA = 0;
            int evenB = 0;

            for(int i = 0; i < n; i++){
                if(a[i] % 2 == 0){
                    evenA++;
                } 
                else{
                    oddA++;
                }

                if(b[i] % 2 == 0){
                    evenB++;
                }
                else{
                    oddB++;
                }
            }

            if(k % 2 == 0){
                System.out.println(oddB <= oddA ? "YES" : "NO");
            }
            else{
                System.out.println(evenB <= evenA ? "YES" : "NO");
            }
        }

        sc.close();
    }
}

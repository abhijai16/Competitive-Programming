
import java.util.Scanner;

public class Q_282A_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int X = 0;
        for(int i=0; i<n; i++){
            String operator = sc.nextLine();
            if(operator.equals("X++") || operator.equals("++X")){
                X++;
            }
            else if(operator.equals("--X") || operator.equals("X--")){
                X--;
            }
        }
        System.out.println(X);
        sc.close();
    }
}

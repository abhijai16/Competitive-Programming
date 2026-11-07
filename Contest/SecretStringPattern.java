
import java.util.*;

public class SecretStringPattern{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println("? 1 " + n);
            System.out.flush();

            int totalOnes = sc.nextInt();

            if(totalOnes == -1){
                return;
            }

            if(totalOnes == 0){
                System.out.println("! NO");
                System.out.flush();
                continue;
            }

            System.out.println("? 1 " + totalOnes);
            System.out.flush();

            int prefixOnes = sc.nextInt();

            if(prefixOnes == -1){
                return;
            }

            if(prefixOnes == totalOnes){
                System.out.println("! NO");
            }
            else {
                System.out.println("! YES");
            }

            System.out.flush();
        }

        sc.close();
    }
}


import java.util.Scanner;

public class Q_791A_BearAndBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limak = sc.nextInt();
        int bob = sc.nextInt();
        int count = 0;

        if(limak>bob){
            System.out.println(count);
            return;
        }
        while(limak<=bob){
            limak = limak*3;
            bob = bob*2;
            count++;
        }
        System.out.println(count);
    }
}

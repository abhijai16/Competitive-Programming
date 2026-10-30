
import java.util.Scanner;

public class Q_344A_Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 1;
        int previous = sc.nextInt();

        for(int i=1; i<num; i++){
            int curr = sc.nextInt();
            if(previous!=curr){
                count++;
            }
            previous = curr;
        }

        System.out.println(count);

        sc.close();
    }
}

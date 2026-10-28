
import java.util.Scanner;

public class Q_977A_WrongSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();
        int operations = sc.nextInt();

        for(int i=0; i<operations; i++){
            int digit = (int)(num%10);
            if(digit!=0){
                num--;
            }
            else{
                num = num/10;
            }
        }
        System.out.println(num);

        sc.close();
    }
}

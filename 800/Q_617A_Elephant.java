
import java.util.Scanner;

public class Q_617A_Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long count = 0;

        if(x/5>0){
            count += x/5;
            x = x%5;
        }
        if(x/4>0){
            count += x/4;
            x = x%4;
        }
        if(x/3>0){
            count += x/3;
            x = x%3;
        }
        if(x/2>0){
            count += x/2;
            x = x%2;
        }
        if(x/1>0){
            count += x/1;
            x = x%1;
        }
        System.out.println(count);
        sc.close();
    }
}

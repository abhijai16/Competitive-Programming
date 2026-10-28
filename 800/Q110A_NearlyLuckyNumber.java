
import java.util.Scanner;

public class Q110A_NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();
        int count = 0;

        while(num>0){
            int digit = (int)(num%10);
            if(digit==4 || digit==7){
                count++;
            }
            num = num/10;
        }
        if(count==4||count==7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Q_15K4JR3B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            long n = sc.nextLong();

            long x = n / 2;
            long y = (n + 1) / 2;

            System.out.println(x * y);
        }

        sc.close();
    }
}

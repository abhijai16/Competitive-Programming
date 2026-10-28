
import java.util.Scanner;

public class Q_116A_Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalStops = sc.nextInt();
        int current = 0;
        int max = 0;

        for(int i=0; i<totalStops; i++){
            int exit = sc.nextInt();
            int entry = sc.nextInt(); 
            current -= exit;
            current += entry;
            max = Math.max(current, max);
        }
        System.out.println(max);

        sc.close();
    }
}

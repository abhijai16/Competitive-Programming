
import java.util.HashSet;
import java.util.Scanner;

public class Q_228A_Horseshoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<4; i++){
            int color = sc.nextInt();
            set.add(color);
        }

        System.out.println(4-set.size());
        sc.close();
    }
}

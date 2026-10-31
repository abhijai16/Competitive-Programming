
import java.util.Scanner;

public class Q_313B_IlyaAndQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        
        int[] prefix = new int[str.length() - 1];

        prefix[0] = str.charAt(0) == str.charAt(1) ? 1 : 0;

        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i - 1] + (str.charAt(i) == str.charAt(i + 1) ? 1 : 0);
        }

        int m = sc.nextInt();

        for(int i = 0; i < m; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefix[r - 2];

            if(l > 1){
                ans -= prefix[l - 2];
            }

            System.out.println(ans);
        }

        sc.close();
    }
}

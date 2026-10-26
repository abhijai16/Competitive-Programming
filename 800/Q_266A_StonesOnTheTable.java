
import java.util.Scanner;

public class Q_266A_StonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        StringBuilder str = new StringBuilder();
        str.append(sc.next());
        
        int count = 0;

        if(n<2){
            System.out.println(count);
            return;
        }
        int k = 0;
        int j = 1;
        while(j<str.length()){
            char curr = str.charAt(j);
            char prev = str.charAt(k);
            if(curr==prev){
                str.deleteCharAt(j);
                count++;
            }
            else{
                k++;
                j++;
            }
        }
        System.out.println(count);
    }
}

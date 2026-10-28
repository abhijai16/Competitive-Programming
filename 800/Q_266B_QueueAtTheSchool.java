
import java.util.Scanner;

public class Q_266B_QueueAtTheSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalChildren = sc.nextInt();
        int time = sc.nextInt();
        String initial = sc.next();
        StringBuilder str = new StringBuilder(initial);

        for(int i=0; i<time; i++){
            for(int pos=0; pos<str.length()-1; pos++){
                char first = str.charAt(pos);
                char second = str.charAt(pos+1);
                if(first=='B' && second=='G'){
                    str.setCharAt(pos, 'G');
                    str.setCharAt(pos+1, 'B');
                    pos++;
                }
            }
        }
        System.out.println(str);

        sc.close();
    }
}

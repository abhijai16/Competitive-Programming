
import java.util.Scanner;

public class Q_723A_MeetingFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] pos = new int[3];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<3; i++){
            pos[i] = sc.nextInt();
            if(pos[i]<min){
                min = pos[i];
            }
            if(pos[i]>max){
                max = pos[i];
            }
        }

        System.out.println(max-min);
        
        sc.close();
    }
}

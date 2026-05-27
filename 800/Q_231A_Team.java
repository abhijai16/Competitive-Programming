
import java.util.Scanner;

public class Q_231A_Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[row][3];

        for(int i=0; i<row; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int count=0;
        for(int i=0; i<row; i++){
            int one = 0;
            for(int j=0; j<3; j++){
                if(arr[i][j]==1){
                    one++;
                }
            }
            if(one >= 2){
                count++;
            }
        }
        System.out.println(count);
    }
}

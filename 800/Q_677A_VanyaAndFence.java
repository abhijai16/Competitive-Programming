
import java.util.Scanner;

public class Q_677A_VanyaAndFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int fenceHeight = sc.nextInt();
        int width = 0;

        for(int i=0; i<num; i++){
            int friendHeight = sc.nextInt();
            if(friendHeight>fenceHeight){
                width = width+2;
            }
            else{
                width = width+1;
            }
        }
        System.out.println(width);
        sc.close();

    }
}

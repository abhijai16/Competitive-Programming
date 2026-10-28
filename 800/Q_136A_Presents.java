import java.util.Scanner;

public class Q_136A_Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalFriend = sc.nextInt();
        int[] recieved = new int[totalFriend];

        for(int i=1; i<=totalFriend; i++){
            int given = sc.nextInt();
            recieved[given-1] = i;
        }

        for(int i=0; i<totalFriend; i++){
            System.out.print(recieved[i] + " ");
        }
        
        sc.close();
    }
}

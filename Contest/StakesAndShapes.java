import java.util.Scanner;

public class StakesAndShapes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int n = x + y + z;

            char move;

            if(y >= z){
                move = 'R';
            }
            else if(z >= x){
                move = 'S';
            }
            else{
                move = 'P';
            }

            System.out.println(String.valueOf(move).repeat(n));
        }

        sc.close();
    }
}

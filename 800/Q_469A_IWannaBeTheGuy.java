import java.util.Scanner;

public class Q_469A_IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalLevel = sc.nextInt();
        boolean[] pass = new boolean[totalLevel];

        int totalXLevel = sc.nextInt();
        for(int i=0; i<totalXLevel; i++){
            int xLevel = sc.nextInt();
            pass[xLevel-1] = true;
        }

        int totalYLevel = sc.nextInt();
        for(int i=0; i<totalYLevel; i++){
            int yLevel = sc.nextInt();
            pass[yLevel-1] = true;
        }

        for(int i=0; i<pass.length; i++){
            if(pass[i]==false){
                System.out.println("Oh, my keyboard!");
                return;
            }
        }
        System.out.println("I become the guy.");
        
        sc.close();
    }
}

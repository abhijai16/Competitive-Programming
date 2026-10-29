import java.util.HashMap;
import java.util.Scanner;

public class Q_43A_Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        int max = 0;
        String winner ="";
        
        for(int i=0; i<size; i++){
            String team = sc.next();
            map.put(team, map.getOrDefault(team, 0)+1);
            if(map.get(team)>max){
                max = map.get(team);
                winner = team;
            }
        }
        System.out.println(winner);

        sc.close();
    }
}

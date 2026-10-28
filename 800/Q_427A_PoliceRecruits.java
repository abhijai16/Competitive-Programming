
import java.util.Scanner;

public class Q_427A_PoliceRecruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalEvents = sc.nextInt();
        int policeAvailable = 0;
        int crime = 0;

        for(int i=0; i<totalEvents; i++){
            int event = sc.nextInt();
            if(event<0){
                if(policeAvailable>0){
                    policeAvailable--;
                }
                else{
                    crime++;
                }
            }
            if(event>0){
                policeAvailable += event;
            }
        }
        System.out.println(crime);

        sc.close();
    }
}

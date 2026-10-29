import java.util.Scanner;

public class Q_141A_AmusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String guest = sc.next();
        String host = sc.next();
        String mixed = sc.next();

        int[] guestHost = new int[26];
        int[] mix = new int[26];

        for(char ch:guest.toCharArray()){
            int pos = ch - 'A';
            guestHost[pos]++;
        }
        for(char ch:host.toCharArray()){
            int pos = ch - 'A';
            guestHost[pos]++;
        }
        for(char ch:mixed.toCharArray()){
            int pos = ch - 'A';
            mix[pos]++;
        }

        for(int i=0; i<26; i++){
            if(guestHost[i]!=mix[i]){
                System.out.println("NO");
                sc.close();
                return;
            }
        }
        System.out.println("YES");

        sc.close();
    }
}

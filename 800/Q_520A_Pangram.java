import java.util.Scanner;

public class Q_520A_Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bit = 0;
        
        int size = sc.nextInt();
        if(size<26){
            System.out.println("NO");
            sc.close();
            return;
        }

        String str = sc.next();

        for(int i=0; i<size; i++){
            char ch = str.charAt(i);
            ch = Character.toLowerCase(ch);
            int pos = ch - 'a';

            bit = bit|(1<<pos);
        }

        if(Integer.bitCount(bit)==26){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        sc.close();
    }
}

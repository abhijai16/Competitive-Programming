import java.util.Scanner;

public class FractionAndSix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            String p = sc.next();
            String q = sc.next();

            int[] freq = new int[26];
            for(char ch : p.toCharArray()){
                int index = ch-'a';
                freq[index]++;
            }

            for(char ch : q.toCharArray()){
                int index = ch-'a';
                freq[index]--;
            }

            String target = "six";
            boolean possible = true;

            for(char ch : target.toCharArray()){
                freq[ch - 'a']--;
            }

            for(int count : freq){
                if(count != 0){
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }

        sc.close();
    }
}
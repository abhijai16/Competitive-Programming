
import java.util.HashSet;
import java.util.Scanner;

public class Q_236A_BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> set = new HashSet<>();

        String name = sc.next();

        for(char ch : name.toCharArray()){
            set.add(ch);
        }

        if(set.size()%2==0){
            System.out.println("CHAT WITH HER!");
            return;
        }
        System.out.println("IGNORE HIM!");

        sc.close();
    }
}

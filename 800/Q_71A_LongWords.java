import java.util.*;

public class Q_71A_LongWords{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();
        String[] str = new String[num];
        for(int i=0; i<num; i++){
            str[i] = sc.nextLine();
        }
        for(int i=0; i<num; i++){
            if(str[i].length()>10){
                int difference = str[i].length()-2;
                str[i] = "" + str[i].charAt(0) + difference + str[i].charAt(str[i].length()-1);
            }
        }
        for(int i=0;i<num; i++){
            System.out.println(str[i]);
        }
        sc.close();
    }
}
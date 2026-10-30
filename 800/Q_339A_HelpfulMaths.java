import java.util.Arrays;
import java.util.Scanner;

public class Q_339A_HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int length = str.length();

        int[] arr = new int[(length/2)+1];
        int i=0;
        for(char ch:str.toCharArray()){
            if(ch!='+'){
                arr[i] = ch-'1'+1;
                i++;
            }
        }
        
        Arrays.sort(arr);

        StringBuilder ans = new StringBuilder();

        for(int j=0; j<arr.length; j++){
            if(j==arr.length-1){
                ans.append(arr[j]);
                break;
            }
            ans.append(arr[j]);
            ans.append("+");
        }

        System.out.println(ans);
        
        sc.close();
    }
}

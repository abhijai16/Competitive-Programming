import java.util.Scanner;

public class Q_282A_BitPlusPlus {
    public static void main(String[] args) {
        int x = 0;
        Scanner sc = new Scanner(System.in);

        int totalOperations = sc.nextInt();

        for(int i=0; i<totalOperations; i++){
            String operations = sc.next();
            if(operations.equals("++X") || operations.equals("X++")){
                x++;
            }
            else{
                x--;
            }
        }
        System.out.println(x);

        sc.close();
    }
}

import java.util.Scanner;

public class Q_996A_HitTheLottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long money = sc.nextLong();
        long count = 0;

        while(money!=0){
            if(money/100>0){
                count += money/100;
                money = money%100;
            }
            else if(money/20>0){
                count += money/20;
                money = money%20;
            }
            else if(money/10>0){
                count += money/10;
                money = money%10;
            }
            else if(money/5>0){
                count += money/5;
                money = money%5;
            }
            else{
                count += money/1;
                money = money%1;
            }
        }
        System.out.println(count);
        sc.close();
    }

}

import java.sql.SQLOutput;
import java.util.*;

public class Main {

    static int power(int base,int exp){
        int result = 1;
        for (int i = 1; i <= exp; i++){
            result*=base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Kac tane sayi gireceksiniz ?");
        int k, max = 0 , min = 0;
        int n = input.nextInt();
     if ( n >= 2) {
         for (int i = 1; i <= n; i++) {
             System.out.println(i + "sayiyi giriniz :");
             k = input.nextInt();
             if (i == 1) {
                 max = k;
                 min = k;
             } else {
                 if (k >= max)
                     max = k;
                 if (k <= min)
                     min = k;
             }
         }

         System.out.println("Min number is " + min);
         System.out.println("Max number is " + max);
     }else{
         System.out.println(" !!! ");
     }




    }
}
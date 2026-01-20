import java.util.Locale;
import java.util.Scanner;

public class Condc9 {

   public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double price = 200.00;

        if (price < 200.00) {
            double discount = price * 0.1;
       }

        System.out.println(price);
        sc.close();
    }
}

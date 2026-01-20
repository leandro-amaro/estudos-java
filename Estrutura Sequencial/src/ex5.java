import java.util.Scanner;
import java.util.Locale;
public class ex5 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int p1, p2;
        double preco1, preco2;
        int n1, n2;
        double total;

        p1 = sc.nextInt();
        n1 = sc.nextInt();
        preco1 = sc.nextDouble();

        p2 = sc.nextInt();
        n2 = sc.nextInt();
        preco2 = sc.nextDouble();

        total = (n1 * preco1) + (n2 * preco2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);




    }
}

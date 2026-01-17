import java.util.Scanner;
import java.util.Locale;
public class Condc8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double salario, imposto;

        salario = sc.nextDouble();

        if (salario >= 0.0 && salario <= 2000.00) {
            System.out.println("Isento");
        } else if (salario > 2000.00 && salario <= 3000) {
            imposto = (salario - 2000) * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        } else if(salario > 3000 && salario <= 4500) {
            imposto = (salario - 3000) * 0.18 + 80.0;
            System.out.printf("R$ %.2f%n", imposto);
        } else if (salario > 4500) {
            imposto = (salario - 4500) * 0.28 + 350.0;
            System.out.printf("R$ %.2f%n", imposto);
        }
        sc.close();
    }
}

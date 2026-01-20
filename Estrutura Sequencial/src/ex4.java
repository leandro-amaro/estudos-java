import java.util.Scanner;
import java.util.Locale;
public class ex4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero, hora;
        double valorHora, salario;

        numero = sc.nextInt();
        hora = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = valorHora * hora;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$%.2f%n", salario);
        sc.close();
    }
}

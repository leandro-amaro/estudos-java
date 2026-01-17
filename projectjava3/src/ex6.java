import java.util.Scanner;
import java.util.Locale;

public class ex6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C;
        double areaT, areaC, areaTP, areaQ, areaR;
        double pi = 3.14159;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        areaT = A * C / 2.0;
        areaC = pi * Math.pow(C, 2);
        areaTP = (A + B) * C / 2.0;
        areaQ = Math.pow(B, 2);
        areaR = A * B;

        System.out.printf("TRIANGULO = %.3f%n", areaT);
        System.out.printf("CIRCULO = %.3f%n", areaC);
        System.out.printf("TRAPEZIO = %.3f%n", areaTP);
        System.out.printf("QUADRADO = %.3f%n", areaQ);
        System.out.printf("RETANGULO = %.3f%n", areaR);

        sc.close();

    }
}

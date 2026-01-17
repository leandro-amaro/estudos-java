import java.util.Scanner;
public class Condc5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hotDog = 4.00;
        double xSalada = 4.50;
        double xBacon = 5.00;
        double torradaS = 2.00;
        double refri = 1.50;
        double total;
        int code, quantidade;
        code = sc.nextInt();
        quantidade = sc.nextInt();

        if(code == 1) {
            total = hotDog * quantidade;
            System.out.printf("Total: R$ %.2f%n", total);
        }
        else if(code == 2) {
            total = xSalada * quantidade;
            System.out.printf("Total: R$ %.2f%n", total);
        }
        else if(code == 3) {
            total = xBacon * quantidade;
            System.out.printf("Total: R$ %.2f%n", total);
        }
        else if (code == 4) {
            total = torradaS * quantidade;
            System.out.printf("Total: R$ %.2f%n", total);
        }
        else if(code == 5) {
            total = refri * quantidade;
            System.out.printf("Total: R$ %.2f%n", total);
        }
        sc.close();
    }
}

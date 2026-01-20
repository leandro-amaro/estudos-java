import java.util.Scanner;
public class Condc5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double preco = 0;
        int code, quantidade;
        code = sc.nextInt();
        quantidade = sc.nextInt();

       switch (code) {
           case 1:
               preco = 4.00;
               break;
           case 2:
               preco = 4.50;
               break;
           case 3:
               preco = 5.00;
               break;
           case 4:
               preco = 2.00;
               break;
           case 5:
               preco = 1.50;
               break;
           default:
               System.out.println("Código inválido!");
               return;
       }
       total = preco * quantidade;
       System.out.printf("TOTAL = R$ %.2f%n", total);    
        sc.close();
    }
}

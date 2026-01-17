import java.util.Scanner;
public class Condc1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        num = sc.nextInt();

        if (num > 0) {
            System.out.println("POSITIVO");
        }
        else if (num == 0) {
            System.out.println("NEUTRO");
        }
        else {
            System.out.println("NEGATIVO");
        }

        sc.close();
    }
}

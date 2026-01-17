import java.util.Scanner;
public class Condc4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicio, horaFinal, totalHora;

        horaInicio = sc.nextInt();
        horaFinal = sc.nextInt();

        if (horaInicio < horaFinal) {
            totalHora = horaFinal - horaInicio;
            System.out.println("O JOGO DUROU " + totalHora + " HORA(S)");
        }
        else {
            totalHora = 24 - horaInicio + horaFinal;
            System.out.println("O JOGO DUROU " + totalHora + " HORA(S)");
        }
        sc.close();
    }
}

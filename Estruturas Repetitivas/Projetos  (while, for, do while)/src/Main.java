import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int senhaCorreta = 2026;
        int tentativas = 3;
        int senhaDigitada;
        boolean senhaAcertou = false;
        boolean querSair = false;
        System.out.println(" BEM VINDO AO CAIXA ELETRÔNICO! ");
        System.out.println(" ");
        System.out.println("POR FAVOR, DIGITE SUA SENHA (Se errar, Você terá 3 tentativas!): ");
        senhaDigitada = sc.nextInt();
        if(senhaDigitada == senhaCorreta) {
            senhaAcertou = true;
        }
        if(senhaDigitada != senhaCorreta) {
            while(tentativas > 0 && !senhaAcertou) {

                if(senhaDigitada == senhaCorreta) {
                    senhaAcertou = true;
                    System.out.println("Senha Correta, Bem vindo!");
                    continue;
                } else {
                    tentativas--;
                    System.out.println("Senha incorreta! Você tem mais " + (tentativas + 1) + " tentativas!");
                    System.out.println("POR FAVOR, DIGITE SUA SENHA NOVAMENTE: ");
                    senhaDigitada = sc.nextInt();
                }
            }
        }

        if(senhaAcertou) {
            int opcao = 0;
            double saldo = 3450;
            double saque = 0;
            char yesOrNot;
            while(true) {
                System.out.println("-- MENU PRINCIPAL --");
                System.out.println("1 - Ver Saldo");
                System.out.println("2 - Realizar Saque");
                System.out.println("3 - Sair");
                System.out.print("Selecione a opção desejada: ");
                opcao = sc.nextInt();
                switch(opcao) {
                    case 1:
                        System.out.println("Seu Saldo atual é de R$ " + saldo);
                        break;
                    case 2:
                        System.out.println("Seu Saldo atual é de R$ " + saldo);
                        System.out.print("Quanto deseja sacar: R$ ");
                        saque = sc.nextDouble();
                       if(saque > saldo) {
                           System.out.println("Erro: Saldo insuficiente.");
                           continue;
                       } else {
                           saldo -= saque;
                           System.out.printf("Saque realizado de R$%.2f com sucesso! Seu saldo atual é de R$%.2f%n", saque, saldo);
                       }
                       break;
                    case 3:
                        System.out.println("Deseja realmente sair? (S ou N");
                        yesOrNot = sc.next().charAt(0);
                        if(yesOrNot == 'S' || yesOrNot == 's') {
                            System.out.println("Ok, Obrigado por utilizar nossos serviços!");
                            querSair = true;
                            return;
                        } else if (yesOrNot == 'N' || yesOrNot == 'n') {
                            System.out.println("Ok, voltando ao menu...");
                            break;
                        }
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            }
        }

        sc.close();
    }
}
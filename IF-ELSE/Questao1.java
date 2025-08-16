import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {System.out.println("Digite a idade abaixo.");
        int num = input.nextInt();

        if (num >= 18) {
            System.out.println("Maior de idade!");
            
        }else {
            System.out.println("Menor de idade!");
        }
         // Pergunta ao usuário se deseja continuar
         System.out.println("\nDeseja tentar de novo?");
         System.out.println("1 - Sim");
         System.out.println("2 - Não");
         opcao = input.nextInt(); // Lê a escolha do usuário

    } while (opcao == 1); // Continua se o usuário digitar 1, encerra se digitar 2

    input.close();

    }
}
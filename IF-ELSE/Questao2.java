import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int palpite;

        // Loop até o usuário acertar
        do {
            System.out.print("Digite seu palpite: ");
            palpite = entrada.nextInt();

            if (palpite == 15) {
                System.out.println("Você acertou!");
            } else if (palpite < 15) {
                System.out.println("Seu palpite está abaixo!");
            } else {
                System.out.println("Seu palpite está acima!");
            }
        } while (palpite != 15); // Continua até o usuário acertar

        entrada.close();
    }
}
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int soma_alturas = 0;
        int pessoas_50mais = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = input.nextInt();

            System.out.print("Digite a altura da pessoa " + i + " (em cm): ");
            int altura = input.nextInt();

            if (idade > 50) {
                soma_alturas += altura; // Soma a altura dessa pessoa
                pessoas_50mais++; // Adiciona 1 ao contador de pessoas com mais de 50 anos
            }
        }        
        input.close();
        
        double media_altura = 0; // Inicializa a variável da média das alturas

        if (pessoas_50mais > 0) {
            media_altura = (double) soma_alturas / pessoas_50mais;
        }
        System.out.printf("Média das alturas das pessoas com mais de 50 anos: %.2f%n", media_altura); // Faz a divisão corretamente com casting para double
    }
}

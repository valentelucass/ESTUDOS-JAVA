import java.util.Scanner;

public class Exemplo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numAlunos = 5;

        for (int i = 1; i <= numAlunos; i++) {
            double nota1, nota2, media;

            // Validação da primeira nota
            do {
                System.out.print("Digite a primeira nota do aluno " + i + " (0 a 10): ");
                nota1 = scanner.nextDouble();
            } while (nota1 < 0 || nota1 > 10);

            // Validação da segunda nota
            do {
                System.out.print("Digite a segunda nota do aluno " + i + " (0 a 10): ");
                nota2 = scanner.nextDouble();
            } while (nota2 < 0 || nota2 > 10);

            // Cálculo da média
            media = (nota1 + nota2) / 2;
            System.out.println("Média do aluno " + i + ": " + media);
        }

        scanner.close();
    }
}

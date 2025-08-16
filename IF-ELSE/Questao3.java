import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicita os dois números ao usuário
        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();

        // Verifica se os números são iguais ou calcula a diferença
        if (num1 == num2) {
            System.out.println("Números iguais.");
        } else if (num1 > num2) {
            System.out.println("A diferença é: " + (num1 - num2));
        } else {
            System.out.println("A diferença é: " + (num2 - num1));
        }

        input.close();
    }
}
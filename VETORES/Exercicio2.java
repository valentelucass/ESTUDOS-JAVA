import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeros[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " - Escreva um valor: ");
            numeros[i] = input.nextInt();
        }

        System.out.print("Números ímpares: ");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.print(numeros[i] + ". ");
            }
        }

        System.out.println(); // pula linha

        System.out.print("Números pares: ");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + ". ");
            }
        }

        System.out.println(); // pula linha

        input.close();
    }
}

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contador = 0;
        int pares = 0;
        int impares = 0;

        while (contador < 10) {
            System.out.print(contador + " - " + "Digite um número: ");
            int numero = input.nextInt();

            if (numero % 2 == 0) {
                pares++; // Conta quantos são pares
            } else {
                impares++; // Conta quantos são ímpares
            }

            contador++; // Incremento para rodar 10 vezes
        }

        // Exibe os resultados finais
        System.out.println("Resultados:");
        System.out.println("Quantidade de números PARES: " + pares);
        System.out.println("Quantidade de números ÍMPARES: " + impares);

        input.close();
    }
}

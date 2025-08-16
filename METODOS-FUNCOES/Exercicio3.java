import java.util.Scanner;

public class Exercicio3 {
    public static int encontrarMax(int a, int b){
        if (a > b){
            return a; // Se 'a' for maior que 'b', retorna 'a'. Ao contrário do Print que vai apenas imprimir no console.
        } else {
            return b; // Senão, retorna 'b' (porque 'b' é maior ou igual a 'a').
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numA = input.nextInt();

        System.out.print("Digite o segundo número: ");
        int numB = input.nextInt();

        int maior = encontrarMax(numA, numB); // Chama a função para encontrar o maior número.
        System.out.println("O maior número é: " + maior);

        input.close();
    }
}

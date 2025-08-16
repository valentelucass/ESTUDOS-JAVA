import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetorA = new int[3];
        int[] vetorB = new int[3];

        System.out.println("Digite os 3 valores do vetor A:");
        for (int i = 0; i < 3; i++) {
            vetorA[i] = input.nextInt();
        }

        System.out.println("Digite os 3 valores do vetor B:");
        for (int i = 0; i < 3; i++) {
            vetorB[i] = input.nextInt();
        }

        int produtoEscalar = 0;
        for (int i = 0; i < 3; i++) {
            produtoEscalar += vetorA[i] * vetorB[i];
        }

        System.out.println("O produto escalar é: " + produtoEscalar);
    }
}

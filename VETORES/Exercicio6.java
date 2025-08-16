import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valorA[] = new int[4];
        int valorB[] = new int[7];
        int valorC[] = new int[valorA.length + valorB.length]; // Vetor C com 11 posições

        System.out.println("============ VETOR A ===========");

        for (int i = 0; i < 4; i++){
        System.out.print(i + " - Digite um valor (VetorA): ");
            valorA[i] = input.nextInt();
        }

        System.out.println("============ VETOR B ===========");

        for (int i = 0; i < 7; i++){
            System.out.print(i + " - Digite um valor (VetorB): ");
                valorB[i] = input.nextInt();
            }

        // Junção de A e B em C
        for (int i = 0; i < valorA.length; i++){
            valorC[i] = valorA[i];
        }

        for (int i = 0; i < valorB.length; i++){
            valorC[i + valorA.length] = valorB[i];
        }

        // Exibição do vetor C
        System.out.println("================================");
        System.out.println("Vetor C (junção de A e B):");
        for (int i = 0; i < valorC.length; i++) {
            System.out.print(valorC[i] + " ");
        }

        input.close();
    }
}

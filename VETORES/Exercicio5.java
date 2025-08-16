import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valorA[] = new int[5];
        int valorB[] = new int[5];
        int valorC[] = new int[5];

        System.out.println("============ VETOR A ===========");

        for (int i = 0; i < 5; i++){
        System.out.print(i + " - Digite um valor (VetorA): ");
            valorA[i] = input.nextInt();
        }

        System.out.println("============ VETOR B ===========");

        for (int i = 0; i < 5; i++){
            System.out.print(i + " - Digite um valor (VetorB): ");
                valorB[i] = input.nextInt();
            }

        System.out.println("================================");
        System.out.print("Resultado: ");
        for (int i = 0; i < 5; i++){
            valorC[i] = (valorA[i]-valorB[i]);
            System.out.print(valorC[i] + ". ");
        }

        input.close();
    }
}

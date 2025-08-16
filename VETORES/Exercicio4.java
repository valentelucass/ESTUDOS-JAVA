import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valorA[] = new int[5];
        int valorB[] = new int[5];

        for (int i = 0; i < 5; i++){
        System.out.print(i + " - Digite um valor: ");
            valorA[i] = input.nextInt();
        }
        
        System.out.print("Resultado: ");
        for (int i = 0; i < 5; i++){
            valorB[i] = (valorA[i]*3);
            System.out.print(valorB[i] + ". ");
        }

        input.close();
    }
}

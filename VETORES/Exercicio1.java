import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int numeros[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " - Escreva um valor: ");
            numeros[i] = input.nextInt();
            
        }

        System.out.print("Resultado: ");
        for (int i = 0; i < 10; i++){
            System.out.print(numeros[i] + ". ");
        }
        System.out.println(); // pula linha
        input.close();
    }
}

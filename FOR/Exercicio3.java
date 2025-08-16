import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = input.nextInt();

        for (int i = 1; i <= valor; i++) {
            System.out.println(i);
        }
        input.close();
    }
}

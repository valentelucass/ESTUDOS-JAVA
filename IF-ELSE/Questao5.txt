import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite abaixo primeiro valor: ");
        int num = input.nextInt();

        if (num >= 50 && num <= 100) {
            System.out.println("Pertence ao intervalo.");
        } else {
            System.out.println("Não pertence ao intervalo.");
        }
    input.close();

    }
}
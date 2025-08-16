import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite abaixo primeiro valor: ");
        double num1 = input.nextDouble();

        System.out.println("Agora o segundo valor: ");
        double num2 = input.nextDouble();

        if (num1 > num2) {
            System.out.println("Resultado: " + num1 + ", " + num2);
        } else {
            System.out.println("Resultado: " + num2 + ", " + num1);
        }
    input.close();

    }
}
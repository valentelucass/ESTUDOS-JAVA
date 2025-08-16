import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pimeiro número: ");
        int num1 = input.nextInt();

        System.out.println("Segundo número: ");
        int num2 = input.nextInt();

        System.out.println("Terceiro número: ");
        int num3 = input.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("Os números são iguais!");
        } else {
            int maior;

            if (num1 >= num2 && num1 >= num3) {
                maior = num1;

            } else if (num2 >= num1 && num2 >= num3) {
                maior = num2;
            } else {
                maior = num3;
            }

            System.out.println("Resultado: " + maior);
        }
        
        input.close();

    }

}
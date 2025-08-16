import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //4 - Faça um algoritmo que leia quatro números inteiros – calcule e mostre a soma desses números.

        System.out.println("Coloque o primeiro número:");
        int numero1 = input.nextInt();

        System.out.println("Agora coloque o segundo número:");
        int numero2 = input.nextInt();

        int soma = (numero1 + numero2);
        System.out.println("A soma é: " + soma);

        input.close();
    }
}

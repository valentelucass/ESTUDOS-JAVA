import java.util.Scanner;

public class Questao0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Faça um algoritmo que leia um número inteiro.
        //Se o número for maior que 20 e imprima a metade dele.
        
        System.out.println("Digite um número inteiro: ");
        int num = input.nextInt();

        if (num > 20) {
            System.out.println("Metade do valor: " + (num/2));
        } else {
            System.out.println("O valor não é maior que 20.");
        }

    input.close();

    }
}
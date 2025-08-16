import java.util.Scanner;

public class Questao5 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        //5 - Faça um algoritmo que leia três notas de um aluno – calcule e mostre a média aritmética do aluno.

        System.out.println("Coloque a nota:");
        Double nota1 = input.nextDouble();

        System.out.println("Coloque a nota: ");
        Double nota2 = input.nextDouble();

        System.out.println("Coloque a nota: ");
        Double nota3 = input.nextDouble();

        Double media = (nota1 + nota2 + nota3)/3;
        System.out.println("Sua média é:" + media);

        input.close();
    }
}

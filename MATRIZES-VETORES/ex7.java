import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);

        System.out.print("Quantas notas? ");
        int qtdNotas = input.nextInt();
        double[] notas = new double[qtdNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota "+(i + 1)+": ");
            notas[i] = input.nextDouble();
        }

        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.length;
        System.out.println("A média ficou: " + media);

        input.close();
    }
}

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //12 - Faça um algoritmo que receba um número, calcule e mostre:
        //–O número elevado ao quadrado;
        //–O número elevado ao cubo;
        //–A raiz quadrada do número digitado;
        //–O número elevado a potência 10;

        System.out.println("Coloque aqui seu valor: ");
        double valor = input.nextDouble();

        double quadrado = Math.pow(valor, 2);
        double cubo = Math.pow(valor, 3);
        double raiz = Math.sqrt(valor);
        double potencia = Math.pow(valor, 10);

        System.out.println("Resultado do quadrado: " + quadrado);
        System.out.println("Resultado do cubo: " + cubo);
        System.out.println("Resultado da raíz: " + raiz);
        System.out.println("Resultado da potência em 10: " + potencia);

        input.close();

    }
}
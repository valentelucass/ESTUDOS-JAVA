import java.util.Scanner;

public class Questao13 {

    public static void main(String[] args){

        /* Calculadora de operações básicas: soma, subtração, multiplicação e divisão */

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Bem vindo a Calculadora! Vamos começar.");
        System.out.println("Digite: " +
                " 1 - Soma;" +   
                " 2 - Subtração;" +  
                " 3 - Multiplicação;" +  
                " 4 - Divisão;");

        int operacao = entradaDados.nextInt(); // Usando int para a operação
        System.out.println("");

        if (operacao == 1) {
            System.out.print("Você digitou a operação de soma! Para continuar digite o primeiro número: ");
            if (!entradaDados.hasNextDouble()) {
                System.out.println("Entrada Inválida!");
                System.exit(0);
            }
            double num1 = entradaDados.nextDouble();

            System.out.print("Agora digite o segundo número: ");
            if (!entradaDados.hasNextDouble()) {
                System.out.println("Entrada Inválida!");
                System.exit(0);
            }
            double num2 = entradaDados.nextDouble();

            double resultadoSoma = num1 + num2;
            System.out.println("Os números que você colocou foram: " + num1 + " e " + num2 + ". O resultado da soma será: " + resultadoSoma);

        } else if (operacao == 2) {
            System.out.print("Você digitou a operação de subtração! Para continuar digite o primeiro número: ");
            if (!entradaDados.hasNextDouble()) {
                System.out.println("Entrada Inválida!");
                System.exit(0);
            }
            double num1 = entradaDados.nextDouble();

            System.out.print("Agora digite o segundo número: ");
            if (!entradaDados.hasNextDouble()) {
                System.out.println("Entrada Inválida!");
                System.exit(0);
            }
            double num2 = entradaDados.nextDouble();

            double resultadoSub = num1 - num2;
            System.out.println("Os números que você colocou foram: " + num1 + " e " + num2 + ". O resultado da subtração será: " + resultadoSub);

        } else if (operacao == 3) {
            System.out.print("Você digitou a operação de multiplicação! Para continuar digite o primeiro número: ");
            if (!entradaDados.hasNextDouble()) {
                System.out.println("Entrada Inválida!");
                System.exit(0);
            }
            double num1 = entradaDados.nextDouble();

            System.out.print("Agora digite o segundo número: ");
            if (!entradaDados.hasNextDouble()) {
                System.out.println("Entrada Inválida!");
                System.exit(0);
            }
            double num2 = entradaDados.nextDouble();

            double resultadoMult = num1 * num2;
            System.out.println("Os números que você colocou foram: " + num1 + " e " + num2 + ". O resultado da multiplicação será: " + resultadoMult);

        } else if (operacao == 4) {
            System.out.print("Você digitou a operação de divisão! Para continuar digite o primeiro número: ");
            if (!entradaDados.hasNextDouble()) {
                System.out.println("Entrada Inválida!");
                System.exit(0);
            }
            double num1 = entradaDados.nextDouble();

            System.out.print("Agora digite o segundo número: ");
            if (!entradaDados.hasNextDouble()) {
                System.out.println("Entrada Inválida!");
                System.exit(0);
            }
            double num2 = entradaDados.nextDouble();

            if (num2 == 0) {  // Verifica se o divisor é 0
                System.out.println("Impossível dividir‼");
                System.exit(0);
            }

            double resultadoDiv = num1 / num2;
            System.out.println("Os números que você colocou foram: " + num1 + " e " + num2 + ". O resultado da divisão será: " + resultadoDiv);
        } else {
            System.out.println("Operação inválida! Escolha uma operação entre 1 e 4.");
        }

        entradaDados.close();
    }
}

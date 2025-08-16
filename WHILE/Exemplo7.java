import java.util.Scanner;

public class Exemplo7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int semObesidade = 0;
        int contador = 1;
        while (contador <= 10) {

            double IMC = 0;

            System.out.println("======================");
            System.out.println(contador + " - ");
            System.out.print("Digite a altura (1,90): ");
            double altura = input.nextDouble();

            System.out.print("Digite o peso (90,5): ");
            double peso = input.nextDouble();

            System.out.printf("Seu IMC é = %.2f%n", peso/(altura*altura)); /*A vírgula separa o texto da variável que será formatada. Se usar "+" no lugar, a formatação não funciona. */
            IMC = (peso/(altura*altura));
            contador++;

            if (IMC >= 18.5 && IMC <= 24.9) {
                semObesidade++; // Ele vai contar quantas pessoas está entre esses valores
            }
        }
        System.out.println("Pessoas sem obesidade: " + semObesidade);
        input.close();
    }
}
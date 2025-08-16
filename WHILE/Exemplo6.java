import java.util.Scanner;

public class Exemplo6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contador = 1;
        int numeromenor;

        System.out.print(contador + " - Digite um número: ");
        numeromenor = input.nextInt(); // Primeiro número armazenado

        while (contador < 10) {
            System.out.print((contador + 1) + " - Digite um número: ");
            int numero = input.nextInt();
            
            if (numero < numeromenor) {
                numeromenor = numero;
            }
            contador++;
        }
        System.out.println("Menor número é: " + numeromenor);
        input.close();
    }
}

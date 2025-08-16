import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Digite um valor: ");
            int valor = input.nextInt();

            int resultado = calcularFatorial(valor);
            System.out.println(valor + "! = " + resultado);

            System.out.println("=====================================");
            System.out.print("Deseja verificar outro valor? (s/n): ");
            continuar = input.next().charAt(0); // Lê o primeiro caractere
            System.out.println("=====================================");

        } while (continuar == 'S' || continuar == 's');

        input.close();
    }

    public static int calcularFatorial(int fatorial){
        int resultado = 1;
        for(int i = 1; i <= fatorial; i++){
            resultado *= i; // resultado = resultado * i;
        }
        return resultado;
    }
}

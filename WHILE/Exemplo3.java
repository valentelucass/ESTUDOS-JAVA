import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = input.nextInt();

        int contador = 1;

        while (contador <= valor) {
            System.out.println(contador);
            contador++;
        }
        input.close();
    }
}

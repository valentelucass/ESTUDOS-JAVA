import java.util.Scanner;

public class Exercicio4 {
    public static boolean isPar(int numero){
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char continuar;

    do{
        System.out.print("Digite um número: ");
        int num = input.nextInt();

        /*boolean resultado = isPar(num);
        if(resultado == true){  sendo esse minha primeira tentativa
        mas acabei corrigindo da forma adequada posteriormente com dicas.
        Da forma abaixo ele traz o método que já está comparando.*/

        if(isPar(num)){
            System.out.println("Número é par!");
        } else {
            System.out.println("Número é impar!");
        }

        System.out.println("=====================================");
        System.out.print("Deseja verificar outro número? (s/n): ");
        continuar = input.next().charAt(0); // Lê o primeiro caractere
        System.out.println("=====================================");

        } while (continuar == 's' || continuar == 'S');

        input.close();
    }
}

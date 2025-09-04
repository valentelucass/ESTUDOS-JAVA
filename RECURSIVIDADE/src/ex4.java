import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a base: ");
        int base = input.nextInt();
        System.out.print("Digite o expoente: ");
        int expoente = input.nextInt();
        System.out.println(base + " elevado a " + expoente + " é: " + potencia(base, expoente));

        input.close();
    }

    public static int potencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        } else {
            return base * potencia(base, expoente - 1);
        }
    }
}
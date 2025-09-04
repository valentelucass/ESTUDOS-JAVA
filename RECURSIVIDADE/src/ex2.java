// Usando soma(n), computar soma(6) com rastreamento.

import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int num = input.nextInt();

        for (int i = 0; i < num + 1; i++) {
            System.out.println("Soma("+i+") = " + soma(i));
        }
        input.close();
    }

    public static int soma(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return n + soma(n - 1);
        }
    }
}

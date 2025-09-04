// Considere a função fat(n) do exemplo. Trace as chamadas e retornos para fat(5) e calcule o resultado.
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();
        for (int i = 0; i < num + 1; i++) {
            System.out.println("fat("+i+") = " + fat(i));
        }
        input.close();
    }

    public static int fat(int n) {
        if (n == 0)
            return 1;
         else
            return n * fat(n - 1);

    }
}
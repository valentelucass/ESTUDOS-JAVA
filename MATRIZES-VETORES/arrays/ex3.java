package arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o índice para consultar(ex: 0, 1, 2, 3...): ");
        int valor = scanner.nextInt();
        boolean existe = numeros.contains(valor);

        if (existe == true) {
            System.out.println("Número " + valor + " existe dentro do Array? Existe sim!");
        } else {
            System.out.println("Número " + valor + " existe dentro do Array? Não existe!");
        }
        scanner.close();
    }
}

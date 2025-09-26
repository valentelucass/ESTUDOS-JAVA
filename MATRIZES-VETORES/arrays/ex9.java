package arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int num =  sc.nextInt();

        if (numeros.contains(num)) {
            System.out.println("O número " + num + " existe!");
        } else {
            System.out.println("O número " + num + " não existe!");
        }
    }
}

package arrays;
import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        String[] nomes = {"Zé", "Ana", "João"};
        Arrays.sort(nomes); // Ordena de forma alfabética.
        int indice = Arrays.binarySearch(nomes, "Zé");
        System.out.println(Arrays.toString(nomes));
        System.out.println("Índice de Zé: " + indice);
    }
}

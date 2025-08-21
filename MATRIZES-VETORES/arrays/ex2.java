package arrays;
import java.util.Arrays;
import java.util.ArrayList;

public class ex2 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Ana", "João", "Maria"));

        nomes.add("Antonieta");
        nomes.remove("João");

        String elemento = nomes.get(0);
        int tamanho = nomes.size();
        boolean existe = nomes.contains("Maria");

        System.out.println("Lista completa: " + nomes +
                "\nElemento escolhido: " + elemento +
                "\nTamanho: " + tamanho +
                "\nMaria existe no array? " + existe);
    }
}

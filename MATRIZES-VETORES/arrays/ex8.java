package arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class ex8 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Pedro","Maria","Rodrigues","Antonio"));
        nomes.add("Pedro");
        System.out.println(nomes.toString());
        nomes.remove("Maria"); // Dica: remove("João") remove por valor. Se usar remove(1) remove por índice.
        System.out.println(nomes.toString());
        System.out.println(nomes);
    }
}


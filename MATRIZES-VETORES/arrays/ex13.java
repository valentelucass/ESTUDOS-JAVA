package arrays;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ex13 {
    public static void main(String[] args) {
        String[] frutas = {"Maçã","Banana","Laranja"};
        List<String> view = Arrays.asList(frutas);
        ArrayList<String> lista = new ArrayList<>(view);
        lista.add("Uva");
        System.out.println(lista);
        String[] novo = lista.toArray(new String[0]);
        System.out.println(Arrays.toString(novo));
    }
}

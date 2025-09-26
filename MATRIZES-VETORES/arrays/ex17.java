package arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class ex17 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("A","B","C"));
        lista.add(1,"X");
        System.out.println(lista);


    }

}

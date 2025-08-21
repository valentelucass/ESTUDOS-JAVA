package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ex6 {
    public static void main(String[] args) {
        ArrayList<Integer> elementos = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        System.out.println("Arrays antes de apagar: " + elementos);

        elementos.removeAll(Arrays.asList(10, 20, 30, 40, 50));
        // usei esse mais para ter conhecimento dessa função que existe e não sabia.
        // elementos.clear(); Remove todos os elementos do ArrayList

        System.out.println("Arrays depois de apagar: " + elementos);

    }
}

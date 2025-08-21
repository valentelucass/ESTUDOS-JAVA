package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ex7 {
    public static void main(String[] args) {
        ArrayList<Integer> origem = new ArrayList(Arrays.asList(10, 20, 30, 40, 50));
        ArrayList<Integer> destino = new ArrayList(origem);

        System.out.println("Arrays de origem: " + origem);
        System.out.println("Arrays de destino: " + destino);
    }
}

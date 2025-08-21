package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ex4 {
    public static void main(String[] args) {
        ArrayList<Integer> idades = new ArrayList<>(Arrays.asList(22, 55, 78, 36, 18, 98, 10));

        for (int i = 0; i < idades.size(); i++) {
            System.out.print(idades.get(i) + ", ");
        }
    }
}

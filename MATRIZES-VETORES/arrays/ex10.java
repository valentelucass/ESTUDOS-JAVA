package arrays;
import java.util.Arrays;
import java.util.ArrayList;

public class ex10 {
    public static void main(String[] args) {
        ArrayList<Integer> idades = new ArrayList<>(Arrays.asList(22,55,78,36,18));
        for (int i = 0; i < idades.size(); i++) {
            Integer idade = idades.get(i);
            if (i > 0) System.out.print(", ");
            System.out.print(idade);
        }
    }
}

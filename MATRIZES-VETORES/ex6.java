import java.util.Arrays;

public class ex6 {
    public static void main(String[] args) {
        double[] vetorA = new double[4];

        vetorA[0] = 1.0;
        vetorA[1] = 2.3;
        vetorA[2] = 3.4;
        vetorA[3] = 4.5;

        System.out.println(Arrays.toString(vetorA));

        double total = 0;
        double contador = 0;
        for (int i = 0; i < vetorA.length; i++) {
            total += vetorA[i];
            contador++;
        }
        System.out.println(total / vetorA.length);
        System.out.println(contador);

    }
}

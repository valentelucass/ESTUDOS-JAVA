// 02) Escreva uma função recursiva que calcule a soma dos primeiros n cubos:
//        S(𝑛) = 13 + 23 + ⋯ + 𝑛3

public class ex6 {
    public static int cubo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return (n * n * n) + cubo(n - 1);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(cubo(i));
        }
    }
}

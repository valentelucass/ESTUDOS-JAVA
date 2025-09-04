// 11) Função recursiva para calcular a sequência:
//     F(1) = 1
//     F(2) = 2
//     F(n) = 2 * F(n-1) + 3 * F(n-2) para n > 2


public class ex15 {
    public static int f(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return 2 * f(n - 1) + 3 * f(n - 2);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i == 1) {
                System.out.println("f(1) = 1");
            } else if (i == 2) {
                System.out.println("f(2) = 2");
            } else {
                System.out.println(
                        "f(" + i + ") = 2*f(" + (i - 1) + ") + 3*f(" + (i - 2) + ") = " + f(i)
                );
            }
        }
    }
}

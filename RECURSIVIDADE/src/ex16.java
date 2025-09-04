// 12) Função recursiva para calcular a sequência de Padovan
//     Valores iniciais:
//         P(0) = 1
//         P(1) = 1
//         P(2) = 1
//     Para n > 2:
//         P(n) = P(n-2) + P(n-3)
//     Alguns valores da sequência: 1, 1, 1, 2, 2, 3, 4, 5, 7, 9, 12, 16, 21, 28...


public class ex16 {
    public static int padovan(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return 1;
        } else {
            return padovan(n - 2) + padovan(n - 3);
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println("sf(" + i + ") = " + padovan(i));
        }
    }
}

// 13) Função recursiva para calcular os números de Pell
//     Valores iniciais:
//         P(0) = 0
//         P(1) = 1
//     Para n > 1:
//         P(n) = 2 * P(n-1) + P(n-2)
//     A sequência começa: 0, 1, 2, 5, 12, 29, 70, 169, ...


public class ex17 {
    public static int pell(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return 2* pell(n - 1) + pell(n - 2);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("pell("+i+") = " + pell(i));
        }
    }
}

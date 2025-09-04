// 10) Faça uma função recursiva que receba um número inteiro positivo N e retorne o super-
// fatorial desse número. O super-fatorial de um número N é definido pelo produto dos N
// primeiros fatoriais de N. Assim, o super-fatorial de 4 é:
//
//        s𝑓(4) = 1! ∗ 2! ∗ 3! ∗ 4! = 288

public class ex14 {
    public static int fat(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fat(n - 1);
        }
    }

    public static int superFat(int n) {
        if (n == 0) {
            return 1;
        } else {
            return fat(n) * superFat(n - 1);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i < 4 + 1; i++) {
            System.out.println("sf(" + i + ") = " + superFat(i));
        }
    }
}

// 9) Faça uma função recursiva que receba um número inteiro positivo impar N e retorne o
// fatorial duplo desse número. O fatorial duplo é definido como o produto de todos os
// números naturais ımpares de 1 até algum número natural ımpar N. Assim, o fatorial
// duplo de 5 é:
//        5! = 1 ∗ 3 ∗ 5 = 15

public class ex13 {
    public static int imparRec(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * imparRec(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(imparRec(15));
    }
}

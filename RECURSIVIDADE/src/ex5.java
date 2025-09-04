// 01) Crie uma função recursiva que receba um número inteiro positivo N e calcule o
//somatório dos números de 1 a N.

public class ex5 {
   public static int somatorio(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + somatorio(n - 1); // (n-1) pois ele vai diminuindo o valor no parametro até chegar 0.
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(somatorio(i));
        }
    }
}

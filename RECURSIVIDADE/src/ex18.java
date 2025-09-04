// 14) Dado um número n na base decimal, escreva uma função recursiva que converte este
// número para binário.

public class ex18 {
    public static void decimalParaBinario(int n) {
        if (n > 0) {
            // chamada recursiva com n/2
            decimalParaBinario(n / 2);

            // depois imprime o resto
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        decimalParaBinario(5);
    }
}
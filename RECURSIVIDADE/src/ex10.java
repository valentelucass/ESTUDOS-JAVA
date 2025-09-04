// 06) Faça uma função recursiva que receba um número inteiro positivo N e imprima todos os
// números naturais de 0 até N em ordem decrescente.

public class ex10 {
    public static void numDecrescente(int n){
        if (n < 0) return;
        System.out.println("decrescente("+n+")");
        numDecrescente(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        numDecrescente(n);
    }
}

// 5) Faça uma função recursiva que receba um número inteiro positivo N e imprima todos os
// números naturais de 0 até N em ordem crescente.

public class ex9 {
    public static void numCrescente(int n) { // perceba que o retorno ta vazio, sendo assim, tem que ser void
        if (n < 0) return;
        numCrescente(n-1);
        System.out.println("crescente("+n+")");

    }
    public static void main(String[] args) {
        int n = 5;
        numCrescente(n);
    }
}
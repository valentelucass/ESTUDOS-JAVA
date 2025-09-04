// 7) Crie um programa que contenha uma função recursiva para encontrar o menor
// elemento em um vetor.

public class ex11 {
    public static int menorElementoRecursivo(int[] vetor, int n) {
        if (n == 1) { // caso base: só um elemento
            return vetor[0];
        }

        int menorElemento = menorElementoRecursivo(vetor, n - 1);

        if (menorElemento <= vetor[n - 1]) {
            return menorElemento;
        } else {
            return vetor[n - 1];
        }
    }

    public static void main(String[] args) {
        int[] numeros = {7, 3, 9, 2, 8, 5, 1, 6, 4};
        System.out.println("Menor elemento do vetor: " + menorElementoRecursivo(numeros, numeros.length));
    }
}

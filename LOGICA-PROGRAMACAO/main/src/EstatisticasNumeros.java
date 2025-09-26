public class EstatisticasNumeros {
    public static int contarImpares(int[] numeros) {
        int contador = 0;
        if (numeros.length == 0) {
            return 0;
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                contador = contador + 1;
            }
        }
        return contador;
    }

    public static int contarPares(int[] numeros) {
        int contador = 0; // Variável para contar os números pares
        // Se o array for vazio, retorna 0
        if (numeros.length == 0) {
            return 0;
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contador = contador + 1;
            }
        }
        return contador;
    }

    public static int maiorNumero(int[] numeros) {
        int maior = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }

    public static double mediaTotal(int[] numeros) {
        double soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        double media = soma / numeros.length;
        return media;
    }

    public static int menorNumero(int[] numeros) {
        int menor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return menor;
    }

    public static int somaPares(int[] numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                soma += numeros[i];
            }
        }
        return soma;
    }

    public static int somaImpares(int[] numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                soma += numeros[i];
            }
        }
        return soma;
    }
}

// 04) A multiplicação de dois números inteiros pode ser feita através de somas sucessivas.
// Proponha um algoritmo recursivo Multip_Rec(n1,n2) que calcule a multiplicação de dois
// inteiros.

public class ex8 {

    public static int Multip_Rec(int n1, int n2) {
        // Caso base
        if (n2 == 0) {
            return 0;
        }

        // Caso recursivo para positivo
        if (n2 > 0) {
            return n1 + Multip_Rec(n1, n2 - 1);
        }

        // Caso recursivo para negativo
        return -Multip_Rec(n1, -n2);
    }

    public static void main(String[] args) {
        int n1 = 2;

        // imprimindo a tabuada de 2 usando recursividade
        for (int i = 0; i < 10; i++) {
            System.out.println(n1 + " x " + i + " = " + Multip_Rec(n1, i));
        }
    }
}

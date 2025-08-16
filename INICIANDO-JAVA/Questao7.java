public class Questao7 {
    public static void main(String[] args) {

        //7 - **Faça um algoritmo para imprimir em cada linha o resultado lógico das seguintes expressões:
        //– ((120 - 30) = (3 ˆ 30))
        //– (não ((20 módulo 4)= 1) ou (9 != 9))
        //– ((5 módulo 2 ) > 3)
        //– (a = A)
        //- **Dica:** Faça uma linha de cada vez.
        //–faça, teste, e avance para a próxima;
        //–não tente fazer todo código de uma única vez.
        //O RESULTADO DEVE SER TRUE ou FALSE
        
        boolean questao1 = ((120 - 30) == (Math.pow(3, 30)));
        System.out.println("Resultado questão 1: " + questao1);

        boolean questao2 = !(20 % 4 == 1) || (9 != 9);
        System.out.println("Resultado questão 2: " + questao2);

        boolean questao3 = (5 % 2/2) > 3;
        System.out.println("Resultado questão 3: " + questao3);

        char a = 'a';
        char A = 'A';

        boolean questao4 = a == A;
        System.out.println("Resultado questão 4: " + questao4);

    }
}
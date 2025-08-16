public class  Questao6 {
    public static void main (String[] args) {

        //6 - Faça um algoritmo que calcule e imprima o valor de cada expressão a seguir:
        //– (20 - 15)/2
        //– 2 ˆ (5/20) + 30 / (15 ˆ 2)
        //– 35 / (6 + 2)
        //– 23 módulo 4

        System.out.println("Primeira expressão: " + (20 - 15)/2);
        System.out.println("Segunda expressão: " + (Math.pow(2, (5.0 / 20)) + (30.0 / Math.pow(15, 2))));
        System.out.println("Terceira expressão: " + (35 / (6 + 2)));
        System.out.println("Quarta expressão: " + 23 % 4);
        
    }
}
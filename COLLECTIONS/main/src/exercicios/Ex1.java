package exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex1 {
    /*1. Cadastre 5 números em uma fila dinâmica e mais 5 em uma pilha dinâmica. Em
    seguida, mostre três relatórios. */
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        Queue<Integer> fila = new LinkedList<>();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);

        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(4);
        fila.add(5);

        System.out.print("Os números que estão nas duas estruturas: ");
        for(Integer i : pilha) {
            if(fila.contains(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Os que estão na pilha: " + pilha);
        System.out.println("Os que estão na fila: " + fila);
    }
}

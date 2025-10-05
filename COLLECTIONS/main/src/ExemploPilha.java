import java.util.Stack;

public class ExemploPilha {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);

        System.out.println(pilha); // [4, 3, 2, 1]
        //System.out.println(pilha.pop());
        System.out.println("Último elemento: " + pilha.peek());

        int desempilhado = pilha.pop();
        System.out.println("Elemento desempilhado: " + desempilhado);
        System.out.println(pilha); // retirou o último elemento da pilha

        pilha.clear();
        System.out.println(pilha);

        if(pilha.isEmpty()) {
            System.out.println("Pilha vazia");
        } else {
            System.out.println("A pilha não está vazia");
        }

        int elem = 2;
        int posicao = pilha.search(elem);
        if(posicao != -1) {
            System.out.println("Elemento " + elem + " na posicao " + posicao);
        } else {
            System.out.println("Elemento " + elem + " não encontrado");
        }
    }
}

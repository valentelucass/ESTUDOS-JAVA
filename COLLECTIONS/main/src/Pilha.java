import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();

        pilha.push("Lucas");
        pilha.push("Pamela");
        pilha.push("Maria");
        pilha.push("Moana");
        pilha.push("Joana");
        pilha.add("Leonardo");
        pilha.add("Pedro");

        System.out.println(pilha);

        System.out.println("Elemento no topo: " + pilha.peek()); // mostra o elemento no topo da pilha
        System.out.println("Elemento no topo: " + pilha.pop()); // retira o elemento no topo da pilha
        System.out.println(pilha);

        System.out.println(pilha.search("Maria"));
        System.out.println(pilha.search("Joana"));

        for(String candidato : pilha) {
            System.out.println(candidato.toUpperCase());
        }

    }
}

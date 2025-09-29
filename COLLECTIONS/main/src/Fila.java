import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Lucas");
        fila.offer("Pamela");
        fila.add("Maria");
        fila.offer("Moana");
        fila.add("Joana");


        System.out.println(fila);
        System.out.println(fila.peek()); // primeiro elemento da fila
        System.out.println(fila.element()); // primeiro elemento da fila, parecido com o peek com uma pequena diferença
        System.out.println(fila.poll()); // retira o primeiro elemento da fila
        System.out.println(fila);

        System.out.println(fila.contains("Lucas"));
    }
}

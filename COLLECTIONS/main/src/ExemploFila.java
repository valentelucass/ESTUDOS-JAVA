import java.util.LinkedList;
import java.util.Queue;

public class ExemploFila {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();

        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(4);
        fila.offer(10);

        System.out.println("Fila: " + fila);
        System.out.println(fila.peek());
        System.out.println(fila.poll());
        System.out.println(fila);

        System.out.println(fila.contains(10));

        //fila.clear();
        System.out.println(fila);

        int removido = fila.poll();
        System.out.println("Removido: " + removido);
    }
}

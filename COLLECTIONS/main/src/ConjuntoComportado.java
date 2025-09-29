import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {
    public static void main(String[] args) {
        Set<String> lista = new HashSet<>();

        lista.add("lucas");
        lista.add("joao");
        lista.add("maria");
        lista.add("joao");

        System.out.println(lista);
        System.out.println(lista.size());
        System.out.println(lista.isEmpty());
        System.out.println(lista.contains("joao"));
        System.out.println(lista.contains("maria"));
        System.out.println(lista.contains("pedro"));
        System.out.println(lista.containsAll(lista));
        System.out.println(lista.containsAll(new HashSet<String>()));
        System.out.println(lista.containsAll(new HashSet<String>() {{add("joao");}}));

        for(String candidato : lista) {
            System.out.println(candidato);
        }


        lista.remove("joao");
        System.out.println(lista);

        Set<Integer> lista2 = new HashSet<>();
        lista2.add(1);
        lista2.add(2);
        lista2.add(3);
        lista2.add(4);
        lista2.add(5);
        System.out.println(lista2);
        lista2.retainAll(new HashSet<Integer>() {{add(1);add(2);}});
    }
}

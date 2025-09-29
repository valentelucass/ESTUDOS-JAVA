import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario("Lucas"));
        lista.add(new Usuario("Pamela"));
        lista.add(new Usuario("Maria"));
        lista.add(new Usuario("Moana"));

        System.out.println("Nome da pessoa por indice: " + lista.get(3).nome);

        lista.remove(2);
        lista.remove(new Usuario("Maria"));

        System.out.println(lista.contains(new Usuario("Lucas")));

        for(Usuario u : lista) {
            System.out.println(u.toString());
        }
    }
}

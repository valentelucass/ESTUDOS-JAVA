import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Lucas");
        usuarios.put(2, "Pamela");
        usuarios.put(3, "Maria");
        usuarios.put(4, "Moana");
        usuarios.put(5, "Joana");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.containsKey(1));
        System.out.println(usuarios.containsValue("Maria"));
        System.out.println(usuarios.keySet());

        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.get(1));

        for(int chave : usuarios.keySet()) {
            System.out.println(chave + " - " + usuarios.get(chave));
        }

        for(String valor: usuarios.values()) {
            System.out.println(valor);
        }

        for(Map.Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.println(registro.getKey() + " => " + registro.getValue());
        }

    }
}

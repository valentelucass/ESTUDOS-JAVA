import java.util.HashSet;
import java.util.Set;

public class ConjuntosBaguncados {

    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("ola");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println(conjunto);
        System.out.println(conjunto.size());

        conjunto.remove(1);
        System.out.println(conjunto);

        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(1.2));
        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains("ola"));
        System.out.println(conjunto.contains(true));
        System.out.println(conjunto.isEmpty());
        System.out.println(conjunto.containsAll(conjunto));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.retainAll(nums);

        System.out.println(conjunto.size());

    }
}

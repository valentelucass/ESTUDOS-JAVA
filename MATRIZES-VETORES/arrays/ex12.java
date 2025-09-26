package arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class ex12 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,36,48,5,6,7,8,9};
        int[] sub = Arrays.copyOfRange(nums, 3, 7);

        System.out.println(Arrays.toString(sub));
    }
}

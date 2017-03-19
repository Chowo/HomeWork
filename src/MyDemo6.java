import java.util.Arrays;

/**
 * Created by Wowa on 19.03.2017.
 */
public class MyDemo6 {
    public static void main(String[] args) {
        int[] a = {5,6,7,9,10,12};
        int[] b = {5,6,7,9,10,12,20,21,22,25};
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
        a=b;
        System.out.println("a = " +  Arrays.toString(a));
        System.out.println("b = " +  Arrays.toString(b));
    }
}

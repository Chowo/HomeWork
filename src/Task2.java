import java.util.Arrays;
import java.util.Random;

/**
 * Created by Srudent-26 on 09.03.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] x = new int[random.nextInt(21) + 20];
        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(150);
        }
        double sum=0;
        for (int i : x) {
            sum+=i;
        }
        double v=sum/x.length;
        System.out.println(Arrays.toString(x));

        System.out.println("v = " + v);
    }
}

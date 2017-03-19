import java.util.Random;

/**
 * Created by Wowa on 13.03.2017.
 */
public class WorkBook1_26 {
    public static void main(String[] args) {
        for (int j = 0; j < 10; j++) {
            Random random = new Random();
            int x = random.nextInt(19) + 1;
            int n = random.nextInt(19) + 1;
            long mult=1;
            System.out.println("x = " + x);
            System.out.println("n = " + n);
            for (int i = 0; i < n; i++) {
                mult*= x;
            }
            System.out.println("mult = " + mult);
            System.out.println();
        }
    }
}

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Srudent-26 on 09.03.2017.
 */
public class Task7 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] x = new int[random.nextInt(10)+5];
        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(10);
        }
        int diff=x[0]-x[1];
        for (int i = 0; i <x.length ; i++) {
            for (int j = 0; j <x.length ; j++) {
                if(x[i]-x[j]>diff){
                    diff=x[i]-x[j];
                }
            }
        }
        System.out.println("diff = " + diff);
        System.out.println(Arrays.toString(x));
    }
}

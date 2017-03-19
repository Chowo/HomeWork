import java.util.Arrays;
import java.util.Random;

/**
 * Created by Srudent-26 on 09.03.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] x = new int[random.nextInt(21) + 20];
            for (int i = 0; i < x.length; i++) {
                x[i] = random.nextInt(150);
            }
            int max=x[0];
            int min=x[0];
        for (int i = 0; i <x.length ; i++) {
            if(max<x[i]){
                max=x[i];
            }
            if(min>x[i]){
                min=x[i];
            }
        }

            System.out.println(Arrays.toString(x));
        System.out.println("min = " + min);
        System.out.println("max = " + max);


    }
}

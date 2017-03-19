import java.util.Arrays;
import java.util.Random;

/**
 * Created by Srudent-26 on 09.03.2017.
 */
public class Task8 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] x = new int[random.nextInt(10)+5];
        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(10);
        }
        int mult=x[0]*x[1];
        for (int i = 0; i <x.length ; i++) {
            for (int j = 0; j <x.length ; j++) {
                if(x[i]*x[j]>mult){
                    if(i!=j){
                        mult=x[i]*x[j];

                    }
                }
            }

        }
        System.out.println("mult = " + mult);
        System.out.println(Arrays.toString(x));
    }
}

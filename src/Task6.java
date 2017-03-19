import java.util.Arrays;
import java.util.Random;

/**
 * Created by Srudent-26 on 09.03.2017.
 */
public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] x = new int[random.nextInt(21) + 20];
        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(150);
        }
        int count=0;
        int tmp=0;
        for (int i = 1; i <x.length ; i++) {
            if(x[i-1]>x[i]){
                tmp++;

            }else
            {
                if(tmp>count){
                    count=tmp;
                }
                tmp=0;
            }
        }
        System.out.println("count = " + count);
        System.out.println(Arrays.toString(x));
    }
}

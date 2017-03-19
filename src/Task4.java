import java.util.Arrays;
import java.util.Random;

/**
 * Created by Srudent-26 on 09.03.2017.
 */
public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] x = new int[random.nextInt(21) + 20];
        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(150);
        }
        int diff;
        int sum1=0;
        int sum2=0;
        for (int i=0; i<x.length; i++){
            if((i+1)%2==0){
                sum1+=x[i];
            }
            if((i+1)%2!=0){
                sum2+=x[i];
            }
        }
        diff=sum1-sum2;
        System.out.println("diff = " + diff);
        System.out.println(Arrays.toString(x));
    }
}

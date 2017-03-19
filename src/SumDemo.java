import java.util.Arrays;
import java.util.Random;

/**
 * Created by Srudent-26 on 09.03.2017.
 */
public class SumDemo {
    public static void main(String[] args) {
        Random random = new Random();
        for (int j = 0; j < 10; j++) {


            int[] marks = new int[random.nextInt(21) + 20];
            for (int i = 0; i < marks.length; i++) {
                marks[i] = 2 + random.nextInt(4);
            }
//        marks[0]=4;
//        marks[1]=5;
//        marks[2]=3;
            int total = 0;
            for (int mark : marks) {
                total += mark;
            }
            System.out.println(total);
            System.out.println(Arrays.toString(marks));
        }
    }
}

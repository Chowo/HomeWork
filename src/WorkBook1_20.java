import java.util.Random;

/**
 * Created by Wowa on 12.03.2017.
 */
public class WorkBook1_20 {
    public static void main(String[] args) {
        for (int j = 0; j <10 ; j++) {
            Random random = new Random();
            int n = random.nextInt(100);
            int i = random.nextInt(6) + 1;
            System.out.println("n = " + n);
            System.out.println("i = " + i);
            if (i != 5 && n >= 40 && n <= 60) {
                System.out.println("Вечеринка удалась");
            } else if (i == 5 && n >= 40) {
                System.out.println("Вечеринка удалась");
            } else {
                System.out.println("Вечеринка не удалась");
            }
        }
    }
}

import java.util.Random;

/**
 * Created by Wowa on 12.03.2017.
 */
public class WorkBook1_6 {
    public static void main(String[] args) {
        for (int i = 0; i <20 ; i++) {
            Random random = new Random();
            int a = random.nextInt(2000) - 1000;
            int b = random.nextInt(2000) - 1000;
            int c = random.nextInt(2000) - 1000;
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            if ((a > b && a < c) || (a > c && a < b)) {
                System.out.println("Среднее значение = " + a);
            }else if ((b > a && b < c) || (b > c && b < a)) {
                System.out.println("Среднее значение = " + b);
            }else if ((c > a && c < b) || (c > b && c < a)) {
                System.out.println("Среднее значение = " + c);
            }else if (a == c && b == c) {
                System.out.println("Все значения равны");
            }else
                System.out.println("Два значения равны друг другу, среднего значения нет");

        }
    }
}

import java.util.Random;

/**
 * Created by Wowa on 12.03.2017.
 */
public class WorkBook1_15 {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            Random random = new Random();
            int month = random.nextInt(11) + 1;
            if (month == 1) {
                System.out.println(month + "-й месяц - Январь");
            } else if (month == 2) {
                System.out.println(month + "-й месяц - Февраль");
            } else if (month == 3) {
                System.out.println(month + "-й месяц - Март");
            } else if (month == 4) {
                System.out.println(month + "-й месяц - Апрель");
            } else if (month == 5) {
                System.out.println(month + "-й месяц - Май");
            } else if (month == 6) {
                System.out.println(month + "-й месяц - Июнь");
            } else if (month == 7) {
                System.out.println(month + "-й месяц - Июль");
            } else if (month == 8) {
                System.out.println(month + "-й месяц - Август");
            } else if (month == 9) {
                System.out.println(month + "-й месяц - Сентябрь");
            } else if (month == 10) {
                System.out.println(month + "-й месяц - Октябрь");
            } else if (month == 11) {
                System.out.println(month + "-й месяц - Ноябрь");
            } else if (month == 12) {
                System.out.println(month + "-й месяц - Декабрь");
            }
        }
    }
}

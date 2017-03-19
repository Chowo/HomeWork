import java.util.Random;

/**
 * Created by Wowa on 12.03.2017.
 */
public class WorkBook1_16 {
    public static void main(String[] args) {
        for (int i = 0; i <20 ; i++) {
            Random random = new Random();
            int month = random.nextInt(11) + 1;
            switch (month) {
                case 1:
                    System.out.println(month + "-й месяц - Январь");
                    break;
                case 2:
                    System.out.println(month + "-й месяц - Февраль");
                    break;
                case 3:
                    System.out.println(month + "-й месяц - Март");
                    break;
                case 4:
                    System.out.println(month + "-й месяц - Апрель");
                    break;
                case 5:
                    System.out.println(month + "-й месяц - Май");
                    break;
                case 6:
                    System.out.println(month + "-й месяц - Июнь");
                    break;
                case 7:
                    System.out.println(month + "-й месяц - Июль");
                    break;
                case 8:
                    System.out.println(month + "-й месяц - Август");
                    break;
                case 9:
                    System.out.println(month + "-й месяц - Сентябрь");
                    break;
                case 10:
                    System.out.println(month + "-й месяц - Октябрь");
                    break;
                case 11:
                    System.out.println(month + "-й месяц - Ноябрь");
                    break;
                case 12:
                    System.out.println(month + "-й месяц - Декабрь");
                    break;

            }
        }
    }
}

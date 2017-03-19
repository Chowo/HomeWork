import java.util.Random;
import java.util.Scanner;

/**
 * Created by Wowa on 13.03.2017.
 */
public class WorkBook4_4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите число от 0 до 50");
        int val=scan.nextInt();
        Random random = new Random();
        int[] x = new int[random.nextInt(20)+100];
        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(50);
        }
        int count=0;
        for (int i = 0; i <x.length ; i++) {
            if (x[i]==val)
                count++;
        }
        System.out.println("Количество совпадений: " + count);
    }
}

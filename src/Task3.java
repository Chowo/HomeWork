import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Srudent-26 on 09.03.2017.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите число от 0 до 50");
        int val=scan.nextInt();
        Random random = new Random();
        int[] x = new int[random.nextInt(20)+30];
        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(50);
        }
        for (int i = 0; i <x.length ; i++) {
            if(val==x[i]){
                System.out.println("i = " + i);
                break;
            }else if(i==x.length-1){
                System.out.println("-1");

            }
        }
        for (int i = x.length-1; i >=0 ; i--) {
            if(val==x[i]){
                System.out.println("i = " + i);
                break;
            }else if(i==0){
                System.out.println(-1);
            }
        }
        System.out.println(Arrays.toString(x));


    }
}

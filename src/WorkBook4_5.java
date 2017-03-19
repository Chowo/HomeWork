import java.util.Scanner;

/**
 * Created by Wowa on 13.03.2017.
 */
public class WorkBook4_5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите число от 0 до 50");
        int n=scan.nextInt();
        int fakt=1;
        for (int i = 1; i <=n ; i++) {
            fakt*=i;
        }
        System.out.println("fakt = " + fakt);
    }
}

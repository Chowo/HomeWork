import java.util.Scanner;

/**
 * Created by Srudent-26 on 07.03.2017.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int m=scan.nextInt();
        int n=scan.nextInt();
        for (int i = Math.min(m, n); i <=Math.max(m, n) ; i++) {
            for (int j = Math.min(m, n); j <=Math.max(m, n) ; j++) {
                int val = i*j;
                int s=getCountsOfDigits(Math.max(m, n)*Math.max(m, n))+1;
                String space = "%"+s+"d";
                System.out.printf(space, val);
            }
            System.out.println();
        }
    }
    public static int getCountsOfDigits(int number){
        return String.valueOf(Math.abs(number)).length();
    }
}

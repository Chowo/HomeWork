import java.util.Scanner;

/**
 * Created by Wowa on 12.03.2017.
 */
public class ToBinaryEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int a0 = 0; a0 < T; a0++) {
            long N = in.nextLong();
            String binar="";
            while (N != 1) {
                if (N % 2 == 0)
                    binar=binar+"0";
                if (N % 2 == 1)
                    binar=binar+"1";
                N/=2;
            }
            System.out.println(binar+"1");
        }


    }
}
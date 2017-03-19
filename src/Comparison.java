import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by Wowa on 05.03.2017.
 */
public class Comparison {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        double a = getDouble(scan);
        double b = getDouble(scan);
        double c = getDouble(scan);
        double y = 0.0000000001;
        if(Math.abs((a+b)-c)<y){
            System.out.println("Yes");
            System.out.println("(a +b) - c = " + (a+b-c));
            System.out.println("a + b = " + (a+b));
        }
        else{
            System.out.println("No");
            System.out.println("(a +b) - c = " + (a+b-c));
            System.out.println("a + b = " + (a+b));
        }
    }
    public static double getDouble (Scanner scan){
        while (true){
            if (!scan.hasNextDouble()){
                scan.nextLine();
            }else{
                double tmp = scan.nextDouble();
                if (Double.isFinite(tmp)){
                    return tmp;
                }
            }
        }
    }
}


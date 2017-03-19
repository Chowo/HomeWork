import java.util.Scanner;

/**
 * Created by Wowa on 05.03.2017.
 */
public class Workbook1_4 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        double a = getDouble(scan);
        double b = getDouble(scan);
        double c = getDouble(scan);
        if (Math.abs(c-a)<Math.abs(c-b))
            System.out.println(a);
        if (Math.abs(c-a)>Math.abs(c-b))
            System.out.println(b);
        if (Math.abs(Math.abs(c-a)-Math.abs(c-b))<0.00000001)
            System.out.println(a);
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

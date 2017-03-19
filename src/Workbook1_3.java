import java.util.Scanner;

/**
 * Created by Wowa on 05.03.2017.
 */
public class Workbook1_3 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        double a = getDouble(scan);
        double b = getDouble(scan);
        if (Math.abs(10-a)<Math.abs(10-b))
            System.out.println(a);
        if (Math.abs(10-a)>Math.abs(10-b))
            System.out.println(b);
        if (Math.abs(Math.abs(10-a)-Math.abs(10-b))<0.0000001)
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

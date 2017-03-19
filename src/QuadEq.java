import java.util.Scanner;

/**
 * Created by Wowa on 05.03.2017.
 */
public class QuadEq {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        double a =getDouble(scan);
        double b =getDouble(scan);
        double c =getDouble(scan);
        double d=Math.pow(b,2)-4*a*c;
        if (a==0&&b==0&&c==0)
            System.out.println("x - любое число");
        if (a==0) {
            double x = -c / b;
            if (b==0&&c!=0)
                System.out.println("При указанном значении b, уравнение не имеет вещественного решения");
            if (b!=0&&c!=0)
                System.out.println("x = " + x);
        }
        if(a!=0&&b!=0) {
            if (d > 0) {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("2 " + x1 + " " + x2);
            }
            if(Math.abs(d)<0.0000001) {
                double x = (-b / (2 * a));
                System.out.println("1 " + x);
            }
            if (d < 0)
                System.out.println("Уравнение не имеет вещественных корней");
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

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Wowa on 01.03.2017.
 */
public class LinEq {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a;
        double b;
        System.out.println("Решение линейного уравнения ax + b = 0");
        while (true){
                System.out.println("Введите значение a: ");
                if (!scan.hasNextDouble()){
                    System.out.println("Вы ввели не число, попробуйте еще раз");
                    scan.nextLine();
                }else{
                    a = scan.nextDouble();
                    if (Double.isFinite(a)){
                        break;
                    } else
                        System.out.println("Вы ввели бесконечность, введите число");
                }
        }
        while (true){
            System.out.println("Введите значение b: ");
            if (!scan.hasNextDouble()){
                System.out.println("Вы ввели не число, попробуйте еще раз");
                scan.nextLine();
            }else{
                b = scan.nextDouble();
                if (Double.isFinite(a)){
                    break;
                } else
                    System.out.println("Вы ввели бесконечность, введите число");
            }
        }
        double x = -b / a;
        if (a==0&&b==0)
            System.out.println("x - любое число");
        if (a==0&&b!=0)
            System.out.println("При указанном значении a, уравнение не имеет вещественного решения");
        if (a!=0)
            System.out.println("x = " + x);
    }
}

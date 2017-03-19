import java.util.Scanner;

/**
 * Created by Wowa on 06.03.2017.
 */
public class WorkBook4_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num= new int[10];
        int sum=0;
        for (int i=0;i<10;i++){
            System.out.println("Введите число №"+(i+1));
            while (true) {
                if (scan.hasNextInt()) {
                    num[i] = scan.nextInt();
                    scan.nextLine();
                    break;
                }
                else{
                    System.out.println("Вы ввели не целое число, попробуйте еще раз");
                    scan.nextLine();
                }
            }
            sum+=num[i];
        }
        double ans=(double)sum/10;
        System.out.println("Среднее арифметическое элементов массива= " + ans);

    }
}

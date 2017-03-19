import java.util.Scanner;

/**
 * Created by Wowa on 05.03.2017.
 */
public class Workbook1_1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n;
        System.out.println("Введите целое число n");
        while (true){
            if(!scan.hasNextInt()){
                scan.nextLine();
                System.out.println("Вы ввели не целое число, попробуйте еще раз");
            }
            else {
                n=scan.nextInt();
                break;
            }
        }
        if(n%2==0){
            System.out.println("Четное!");
        }
        else{
            System.out.println("Нечетное!");
        }
    }
}

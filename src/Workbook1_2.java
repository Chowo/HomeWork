import java.util.Scanner;

/**
 * Created by Wowa on 05.03.2017.
 */
public class Workbook1_2 {
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
        String answer = n%2==0 ? "Четное!": "Нечетное!";
        System.out.println(answer);
    }
}

import java.util.Scanner;

/**
 * Created by Wowa on 06.03.2017.
 */
public class SmSort1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Введите целое число от 1 до 5000:");
        while (true){
            if (scan.hasNextInt()) {
                n = scan.nextInt();
                scan.nextLine();
                if (n>0&&n<=5000)
                    break;
            }
            else
                System.out.println("Вы ввели не корректное число, попробуйте еще раз");
        }
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            while (true) {
                if (scan.hasNextInt()) {
                    a[a_i] = scan.nextInt();
                    scan.nextLine();
                    break;
                } else
                    System.out.println("Вы ввели не корректное число, попробуйте еще раз");
            }
        }
        for (int i=1; i<n; i++){
            int tmp;
            if(a[i]<a[i-1]){
                tmp=a[i-1];
                a[i-1]=a[i];
                a[i]=tmp;
            }
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(a[i]+" ");
        }
    }
}

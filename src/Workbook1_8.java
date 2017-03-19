/**
 * Created by Srudent-26 on 07.03.2017.
 */
public class Workbook1_8 {
    public static void main(String[] args) {
        int y=1900;
        if(y%400==0){
            System.out.println("Високосный год");
        }else if(y%4==0&&y%100!=0){
            System.out.println("Високосный год");
        }else {
            System.out.println("Невисокосный год");
        }
        // write your code here
    }
}

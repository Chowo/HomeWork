/**
 * Created by Wowa on 12.03.2017.
 */
public class Muster {
    public static void main(String[] args) {
//        int x=5;
//        int y=7;
//        x = x ^ y; // стало 2
//        System.out.println(x);
//        x = x ^ y; // стало 5
//        System.out.println(y);
//        x = x ^ y; //стало 7
//        System.out.println(x);
        int a=240000;
        int count=1;
        do{
            a=a/2;
            count++;
        }while(a!=1);
        System.out.println(count);

    }
}

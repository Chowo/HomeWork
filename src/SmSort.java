import java.util.Random;
import java.util.Scanner;

/**
 * Created by Wowa on 06.03.2017.
 */
public class SmSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] x = new int[random.nextInt(20)+15];
        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(1000);
        }
        for (int i=0; i<x.length; i++){
            for (int j = i+1; j <x.length ; j++) {
                if(x[i]>x[j]){
                    int tmp;
                    tmp=x[i];
                    x[i]=x[j];
                    x[j]=tmp;
                }

            }
        }
        for (int i = 0; i <x.length ; i++) {
            System.out.print(x[i]+" ");
        }
    }
}

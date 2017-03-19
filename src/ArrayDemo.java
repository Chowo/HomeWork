import java.util.Arrays;

/**
 * Created by Srudent-26 on 09.03.2017.
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[][] arr2=new int[4][3];
        arr2[0]= new int[9];
        arr2[1]= new int[5];
        arr2[2]= new int[2];
        int[] a={1,5,8};
        int[][] arr={{4, 6},{4,8,9,5}};
        for (int i:a){
            System.out.println("a[i] = " + a[i]);
        }
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr));

    }
}

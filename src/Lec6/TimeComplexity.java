package Lec6;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Srudent-26 on 16.03.2017.
 */
public class TimeComplexity {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[50];
        for (int i = 0; i <array.length ; i++) {
            array[i]=random.nextInt(1000)+1;
        }
        System.out.println(Arrays.toString(array));
        MergeSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    static void MergeSort(int[] array, int left, int right){
        if(left==right)
            return;
        if(left<0&&right>array.length-1)
            throw new IllegalArgumentException("out of boounds");
        if (left>=right)
            throw new IllegalArgumentException("left<right");
        int middle = (left+right)/2;
        MergeSort(array, left, middle);
        MergeSort(array, middle+1, right);

        int l = left;
        int r = middle+1;
        int [] temp = new int[array.length];
        for (int pos=left; pos<=right; pos++) {
            if (l > middle) {
                // В левой половине никого не осталось, берем из правой
                temp[pos] = array[r++];
            } else if (r > right) {
                temp[pos] = array[l++];
            } else {
                if (array[l] < array[r]) {
                    temp[pos] = array[l++];
                } else {
                    temp[pos] = array[r++];
                }
            }
        }
        for (int i = left; i < right ; i++) {
            if(temp[i]>temp[i+1]){
                throw new RuntimeException(left+" "+ right+" "+Arrays.toString(array)+"\n"+Arrays.toString(temp));
            }
        }
        System.arraycopy(temp,left, array,left, right-left+1 );
    }
}

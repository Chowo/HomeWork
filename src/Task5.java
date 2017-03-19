/**
 * Created by Srudent-26 on 09.03.2017.
 */
public class Task5 {
    public static void main(String[] args) {
        int[] x={2,1,5,4,6,3,2,7,8,9,1,6,4,3,5,8,7};
        int count=0;
        int index=0;
        for (int i = 0; i <x.length ; i++) {
            for (int j = 0; j <x.length ; j++) {
                if(x[i]==x[j]){
                    count++;
                }
            }
            if(count!=1) {
                count = 0;
            }else{
                index=i;
            }
        }
        System.out.println(x[index]);
    }
}

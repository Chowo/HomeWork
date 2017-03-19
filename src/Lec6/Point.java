package Lec6;

/**
 * Created by Srudent-26 on 16.03.2017.
 */
public class Point <T> {

    T x;
    T y;

    public Point(T x, T y){
        this.x=x;
        this.y=y;
    }

    public static void main(String[] args) {
        Point<Integer> p1 = new Point<>(2,4);
        Point<Double> p2 = new Point<>(2.3, 4.5);

    }
}

package com.company.geometry;

import java.util.Random;

/**
 * Created by Srudent-26 on 14.03.2017.
 */
public class Triangle {

    double a;
    double b;
    double c;
    double area;

    Random random = new Random();

    Point x = new Point();
    Point y = new Point();
    Point z = new Point();




    public Triangle(Point x, Point y, Point z){
        a=Math.sqrt(Math.pow(x.x-y.x,2)+Math.pow(x.y-y.y,2));
        b=Math.sqrt(Math.pow(x.x-z.x,2)+Math.pow(x.y-z.y,2));
        c=Math.sqrt(Math.pow(y.x-z.x,2)+Math.pow(y.y-z.y,2));
    }

    public void DrawRandomTriangles(Triangle[] tri){
        for (int i = 0; i <tri.length ; i++) {
            tri[i]= new Triangle(x.drawPointCoord(), y.drawPointCoord(), z.drawPointCoord());
        }
    }

    public double Area (){
        double p=0.5*(a+b+c);
        area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        if (area<0.000001){
            System.out.println("Вершины треугольника не создают вещественный треугольник");
            return 0;
        } else {
            return area;
        }
    }
}

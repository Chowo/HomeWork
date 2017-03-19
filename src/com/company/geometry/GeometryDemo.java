package com.company.geometry;

import java.util.Random;

/**
 * Created by Srudent-26 on 14.03.2017.
 */
public class GeometryDemo {
    public static void main(String[] args) {
        Random random = new Random();
        Point x = new Point(random.nextInt(51)-100, random.nextInt(51)-100);
        Point y = new Point(random.nextInt(51)-100, random.nextInt(51)-100);
        Point z = new Point(random.nextInt(51)-100, random.nextInt(51)-100);
        Triangle triangle =new Triangle(x,y,z);
        double area = triangle.Area();
        System.out.println(triangle.a+" "+triangle.b+" "+triangle.c);
        System.out.println("area = " + area);
        Triangle[] exp = new Triangle[6];
        for (int i = 0; i <exp.length ; i++) {
            exp[i]=new Triangle(x.drawPointCoord(),y.drawPointCoord(),z.drawPointCoord());
            System.out.println("area ["+i+"] = "+exp[i].Area());
        }






    }
}

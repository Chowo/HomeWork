package com.company.geometry;

import java.util.Random;

/**
 * Created by Srudent-26 on 14.03.2017.
 */
public class Point {
    int x;
    int y;

    public Point(){

    }

    public Point(int x, int y){
        this.x=x;
        this.y=y;

    }
    Random random=new Random();
    public Point drawPointCoord (){
        return new Point(random.nextInt(51)-100, random.nextInt(51)-100);


    }
}

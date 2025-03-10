package com.workintech.pool;

public class Cuboid extends Rectangle{
    private double height;

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return height*getLength()*getWidth();
    }

    public Cuboid(double height, double width, double length){
        super(width,length);
        if(height<0){
            this.height = 0;
        }else{
            this.height = height;
        }
    }



}

package Turtle;

import Drawing.Canvas;
import Drawing.Pen;
import Location.Point;

public class Turtle extends Pen {

    float angle;

    public Turtle (Canvas cvs, Point p, float angle){
        super(cvs);
        //is that my position is empty?
        this.position= new Point(p);
        this.angle=angle;
    }
    public void turnRight(){
        angle+=angle;
    }
    public void turnLeft(){
        angle-=angle;
    }



}

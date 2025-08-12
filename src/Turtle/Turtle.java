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
    public void turnRight(float angle){
       this.angle+=angle;
    }
    public void turnLeft(float angle){
        this.angle-=angle;
    }

    public void forwardTo(float distance){
        float radians = (float) Math.toRadians(angle);
        float x= position.getX()+(float) (distance* Math.cos(radians));
        float y= position.getY()+(float) (distance* Math.sin(radians));
        lineTo(new Point(x,y));
    }

}

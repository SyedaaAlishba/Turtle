package Drawing;
import Location.Point;

public class Pen {
    public Point position;
    private final Canvas cvs;

    public Pen(Canvas cvs) {
        this.position=new Point(0,0);
        this.cvs = cvs;
    }

    public void moveTo(Point z){
        System.out.println("Pen moved to "+z);
        this.position = new Point(z); //one opt
    }
    public void lineTo(Point other){
        System.out.println("Drawing line from "+position+" to "+other);
        Point startCopy = this.position;
        Point endCopy =other;
        cvs.addLine(startCopy, endCopy);
        this.position=other;
    }


    public void setPosition(Point p){
        this.position = new Point(p); // deep copy
    }

}

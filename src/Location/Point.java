package Location;

public class Point {
    private float x;
    private float y;

    public Point(){
        this.x=0;
        this.y=0;
    }

    public Point(float x,float y){
        this.x=x;
        this.y=y;
    }
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    public void set(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }
    public float getY(){
        return y;
    }

    public Point add(Point other) {
        return new Point(this.x + other.x, this.y + other.y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}

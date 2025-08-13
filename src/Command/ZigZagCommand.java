package Command;

import Location.Point;
import Turtle.Turtle;

import java.security.cert.CertPathBuilderResult;

public class ZigZagCommand implements Command {
    Turtle turtle;
    int size;
    public ZigZagCommand(Turtle t, int s){
        this.turtle=t;
        this.size=s;

    }

    @Override
    public void execute() {
        turtle.moveTo(new Point(200,400));
        for (int i = 0; i < 4; i++) {
            turtle.forwardTo(size);   // diagonal line or horizontal step
            turtle.turnLeft(90);
            turtle.forwardTo(size);
            turtle.turnRight(90);
        }
    }

    @Override
    public String getName() {
        return "ZigZag";
    }
}

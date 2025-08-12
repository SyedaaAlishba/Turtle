package Command;

import Turtle.Turtle;

public class SquareCommand implements Command {
     Turtle turtle;
    int size;
    public SquareCommand(Turtle t, int s){
        this.turtle=t;
        this.size=s;

    }

    @Override
    public void execute() {
        for (int i = 0; i < 4; i++) {
            turtle.forwardTo(size);
            turtle.turnRight(90);
        }
    }

    @Override
    public String getName() {
        return "Square Command";
    }
}

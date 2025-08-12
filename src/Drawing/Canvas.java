package Drawing;

import Location.Line;
import Location.Point;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Canvas extends JPanel {

    private List<Line> cvsLines= new ArrayList<>();

    public void addLine(Point s, Point e){
        Line line= new Line(s,e);
        cvsLines.add(line);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Line line : cvsLines) {
            g.drawLine((int)line.start.getX(),(int) line.start.getY(),(int) line.end.getX(),(int) line.end.getY());
        }
    }
}

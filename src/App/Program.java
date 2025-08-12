package App;

import Command.Command;
import Command.SquareCommand;
import Command.ZigZagCommand;
import Drawing.Canvas;
import Location.Point;
import Turtle.Turtle;

import javax.swing.*;
import java.util.Scanner;

public class Program {
    private Command[]commands;
    Scanner scanner= new Scanner(System.in);
    public  void run() {

        Canvas cvs = new Canvas();
        Point point= new Point(100,100);
        Turtle bigTurtle = new Turtle(cvs, point,0 );
        commands=new Command[]{
                new SquareCommand(bigTurtle,50),
//                new ZigZagCommand(bigTurtle,50)
        };

        System.out.println("String driven turtle app");
        System.out.println("Available drawing commands:");
        for (int i = 0; i < commands.length; i++) {
            System.out.println((i+1)+" - "+ commands[i].getName());
        }
        System.out.println("Write a command");
        String command= scanner.nextLine();
        if(command.equals("F+F+F+F")){
            commands[0].execute();
        }

        JFrame frame = new JFrame("Turtle");
        frame.add(cvs);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        


    }
}

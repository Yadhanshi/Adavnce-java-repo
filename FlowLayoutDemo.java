//Program 1.20

import java.awt.Frame;
import java.awt.Label;
import java.awt.FlowLayout;
public class FlowLayoutDemo
{
    public FlowLayoutDemo()
    {
        Frame frame =  new Frame();
        Label label1 = new Label("one");
        Label label2 = new Label("two");
        Label label3 = new Label("three");
        Label label4 = new Label("four");
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setSize(400,400);
        frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        new FlowLayoutDemo();
    }
}
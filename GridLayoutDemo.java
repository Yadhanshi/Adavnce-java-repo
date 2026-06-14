//Program 1.23
import java.awt.Frame;
import java.awt.Button;
import java.awt.GridLayout;
public class GridLayoutDemo
{
    public GridLayoutDemo()
    {
        Frame frame =  new Frame("Grid Layout");
        frame.setLayout(new GridLayout(5,7));
        for(int i = 1; i<=20;i++)
        {
            Button button = new Button(String.valueOf(i));
            frame.add(button);
        }
        frame.setSize(400,300);
        frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        new GridLayoutDemo();

    }
}
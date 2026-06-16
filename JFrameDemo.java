//Program 1.34
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.JApplet;
import javax.swing.*;
public class JFrameDemo
{

    private JFrameDemo()
    {
        JFrame jFrame = new JFrame("Swing Application");
        jFrame.setSize(300,125);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel jLabel = new JLabel("Simple Label with Swing");
        jFrame.add(jLabel);
        jFrame.setVisible(true);
    }

    public static void main(String[] args)
    {
        new JFrameDemo();
    }
}
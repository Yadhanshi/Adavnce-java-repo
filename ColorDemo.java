//Program 1.17

import java.applet.*;
import java.awt.*;
public class ColorDemo extends Applet
{
    public  void paint(Graphics g)
    {
        Color c = new Color(255,100,100);
        g.setColor(c);
        g.drawLine(10,10,50,50);
        g.setColor(Color.blue);
        g.drawOval(10,50,100,100);
    }
}
/*
<APPLET
CODE = "ColorDemo.class";
WIDTH = "400";
HEIGHT = "400";>
</APPLET>
*/
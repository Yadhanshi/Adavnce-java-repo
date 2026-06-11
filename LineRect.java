//program 1.2

import java.applet.*;
import java.awt.*;
public class LineRect extends Applet
{
    public void paint(Graphics g)
    {
        g.drawLine(10,10,50,50);
        g.drawRect(10,60,40,30);
        g.fillRect(60,10,30,80);
        g.drawRoundRect(10,100,80,50,10,10);
        g.fillRoundRect(20,110,60,30,5,5);
        g.drawLine(100,10,230,140);
        g.drawLine(100,140,230,10);
    }
}
/*
<HTML>
<APPLET CODE ="LineRect.class"
    WIDTH = "250";
    HEIGHT = "250";>

</APPLET>
</HTML>
 */
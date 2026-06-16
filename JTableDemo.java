//Program 1.45
import java.awt.Graphics;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<APPLET
CODE ="JTableDemo.class"
width ="300"
height= "300">
</applet>
 */

public class JTableDemo extends JApplet
{
    public void init()
    {
        Container contpan = getContentPane();
        contpan.setLayout(new BorderLayout());
        final String[]colheads={"Name","Roll no","Per"};
        final Object[][]data = {{"ABC","101","40.50"},{"vsr","102","50.40"},{"ERG","103","89.90"}};
        JTable table = new JTable(data,colheads);
        int V =ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int H =ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane jsp = new JScrollPane(table,V,H);
        contpan.add(jsp,BorderLayout.CENTER);
    }
}
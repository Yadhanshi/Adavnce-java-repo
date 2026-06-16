//Program 1.27

import java.awt.Label;
import java.awt.Frame;
import java.awt.Checkbox;
import java.awt.AWTEvent;
import java.awt.event.ItemEvent;
public class CheckBoxEvent
{
    private HandleCheckBox checkBox;
    private Label messegeLabel;
    private boolean isChecked = false;
    public CheckBoxEvent()
    {
        Frame frame =  new Frame("AWT Button Event");
        checkBox =  new HandleCheckBox("Check me...");
        messegeLabel =  new Label();
        frame.add(checkBox);
        frame.add(messegeLabel);
        checkBox.setBounds(10,80,160,30);
        messegeLabel.setBounds(10,160,160,100);
        frame.setSize(400,350);
        frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        new CheckBoxEvent();
    }
    class HandleCheckBox extends Checkbox
    {
            public HandleCheckBox(String label)
            {
                super(label);
                enableEvents(AWTEvent.ITEM_EVENT_MASK);
            }
            protected void processItemEvent(ItemEvent e)
            {
                isChecked = !isChecked;
                messegeLabel.setText("Checked: "+isChecked);
                super.processItemEvent(e);

            }

    }
}
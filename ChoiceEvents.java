//Program 1.28
import java.awt.Frame;
import java.awt.Label;
import java.awt.Choice;
import java.awt.AWTEvent;
import java.awt.event.ItemEvent;
public class ChoiceEvents
{
    private HandleChoice foodChoice;
    private Label messegeLabel;
    public  ChoiceEvents()
    {
        Frame frame =  new Frame("AWT button Evnts");
        foodChoice = new HandleChoice();
        messegeLabel = new Label();
        foodChoice.add("Burger");
        foodChoice.add("Pulses");
        foodChoice.add("Veggies");
        frame.add(foodChoice);
        frame.add(messegeLabel);
        foodChoice.setBounds(30,30,90,30);
        messegeLabel.setBounds(90,90,90,30);
        frame.setSize(400,350);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new ChoiceEvents();
    }
    class HandleChoice extends Choice
    {
        public HandleChoice()
        {
            enableEvents(AWTEvent.ITEM_EVENT_MASK);
        }
        protected void processItemEvent(ItemEvent e)
        {
            messegeLabel.setText(foodChoice.getSelectedItem());
            super.processItemEvent(e);
        }
    }
}
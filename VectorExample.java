import java.util.Iterator;
import java.util.Vector;
public class VectorExample
{
	public static void main(String[] args)
	{
        Vector fruits = new Vector();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        Iterator it = fruits.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
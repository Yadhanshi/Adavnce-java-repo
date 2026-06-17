//Program 3.1
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList arraylist = new ArrayList();
        System.out.println("Intial size of arraylist: " + arraylist.size());
        arraylist.add("A");
        arraylist.add("B");
        arraylist.add("C");
        arraylist.add("D");
        System.out.println("Size of arraylist after adding the element: " + arraylist.size());
        System.out.println("Contents of arraylist: " + arraylist);
        arraylist.add(2,"E");
        System.out.println("Changed content of arraylist after adding the element at given index: " + arraylist);
        arraylist.remove(3);
        arraylist.remove("A");
        System.out.println("Changed content of arraylist by removing the element from the list : " + arraylist);
    }
}
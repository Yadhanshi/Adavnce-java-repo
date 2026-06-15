import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class arraylist {
    
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<Integer>();

        //add elements
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        int element =list.get(0);
    System.out.println(element);

    //add elment in between
    list.add(2,4);
    System.out.println(list);

    //set elemnt
    list.set(0,5);
    System.out.println(list);
    //delete
    list.remove(2);
    System.out.println(list);
    int size = list.size();
    System.out.println(size);

    //loops
    for(int i =0; i<list.size();i++)
    {
        System.out.println(list.get(i));
    }
    System.out.println();

    Collections.sort(list);
    System.out.println(list);
    }
}

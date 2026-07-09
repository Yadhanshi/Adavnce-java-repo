//Program 3.8
import java.util.*;
public class algorithmdemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(); qwxs
        list.add(new String("JAVA"));
        list.add(new String("is"));
        list.add(new String("paltform"));
        list.add(new String("Independent"));
        Comparator r = Collections.reverseOrder();
        Collections.sort(list, r);
        Iterator iter = list.iterator();
        System.out.println("List sorted in reverse order");
        while (iter.hasNext())
            System.out.println(iter.next()+ " ");
        Collections.shuffle(list);
        iter = list.iterator();
        System.out.println("List is shuffled");
        while (iter.hasNext())
            System.out.println(iter.next()+ " ");
        System.out.println();
        System.out.println("Minimum: " +Collections.min(list));
        System.out.println("Maximum: " +Collections.max(list));
    }
}
import java.util.HashMap;
import java.util.*;
public class hash2 {

    public static void main(String[] args) {
        HashMap<String,Integer>  map = new HashMap<>();

        map.put("India",120);
        map.put("US",30);
        map.put("China",50);
        System.out.println(map);

/* 
        if(map.containsKey("China"))
        {
            System.out.println("key is present");
        }else{
            System.out.println("key not present");
        }

        System.out.println(""+map.get("US"));
 
        for(Map.Entry<String, Integer> e : map.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key : keys)
        {
            System.out.println(key);
        }
 */

        map.remove("China");
        System.out.println(map);
        }
    
}

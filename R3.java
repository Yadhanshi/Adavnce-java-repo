import java.util.*;
public class R3 {
    public static   void Printsubsets(ArrayList<Integer>subset)
    {
        for(int i =- 0; i<subset.size();i++)
        {
            System.out.println(subset.get(i)+ " ");
        }
        System.out.println();
    }
    public static void findsubsets(int n ,ArrayList<Integer> subset)
    {
        if(n == 0)
        {
            Printsubsets(subset);
            return;
        
        }
        subset.add(n);
        findsubsets(n-1, subset);

        subset.remove(subset.size()-1);
        findsubsets(n-1, subset);
    }
    public static void main(String[] args) {
        int n =3;
        ArrayList<Integer> subset = new ArrayList<>();
        findsubsets(n, subset);
    }
}

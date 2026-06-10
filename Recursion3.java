//print factorial of a number n

import java.util.*;
public class Recursion3 {

    public static int printfact(int n)
    {
        if(n==1||n==0)
        {
            return 1;
        }
      int  fact1 =  printfact(n-1);
      int factn = n*fact1;
      return factn;
    }
    public static void main(String[] args) {
        int n =5;
        int ans = printfact(n);
        System.out.println(ans);
    }
    
}

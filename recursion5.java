//print x^n (stack height = logn)
public class recursion5 {
    public static int calc(int x,int n)
    {
        if(n== 0)
        {
            return 1;
        }
        if(x == 0)
        {
                return 0;
        }
        //if n is even
        if(n%2 == 0)
        {
           return calc(x,n/2)*calc(x,n/2);
        }
        else//n is odd
        {
            return calc(x,n/2)*calc(x,n/2)*x;

        }

    }
    public static void main(String[] args) {
        int x = 2,n=5;
        int ans= calc(x,n);
        System.out.println(ans);
    } 
}

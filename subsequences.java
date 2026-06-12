//imp 
//time complexity= O(2^n)

public class subsequences {
    public static void subseq(String str,int idx,String newStr)
    {
        if(idx ==str.length())
        {
            System.err.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        subseq(str, idx+1, newStr+currChar);
        subseq(str, idx+1, newStr);
    }    
    public static void main(String args[])
        {
            String str ="abc";
            subseq(str, 0, " ");
        }
    
}

//keypad combination

public class keypad 
{

    public static String[] key = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printcomb(String str,int idx,String combination)
    {
        if(idx == str.length())
        {
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(idx);
        String mapping = key[currChar - '0'];

        for(int i =0; i<mapping.length();i++)
        {
            printcomb(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String args[])
    {
        String str ="4";
        printcomb(str, 0, " ");
    }
    
}

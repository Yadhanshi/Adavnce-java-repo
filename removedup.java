public class removedup {
    public static boolean[] map = new boolean[26];
    public static void reduplicates(String str,int idx,String newStr)

    {
        if(idx == str.length())
        {
            System.out.println(newStr);
            return;
        }
    
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'])
        {
            reduplicates(str, idx+1, newStr);
        }
        else{
            newStr += currChar;
            map[currChar - 'a'] = true;
            reduplicates(str, idx+1, newStr);
        }
    }
    public static void main(String[] args) {
        String str ="abbacccda";
        reduplicates(str, 0, " ");
        
    }
    
}

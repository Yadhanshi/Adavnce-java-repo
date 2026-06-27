//Program 2.3.......Reading bytes from file
import java.io.*;
class ReadBytes
{
    public static void main(String[] args)
    {
        FileInputStream infile = null;
        int b;
        try
        {
            infile = new FileInputStream("city.txt");
            while((b= infile.read())!=-1)
            {
                System.out.print((char)b);
            }
            infile.close();

        } catch (IOException ioe) {
            System.out.println("ioe");

        }
    }
}
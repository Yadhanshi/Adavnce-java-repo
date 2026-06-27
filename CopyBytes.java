//Program 2.4.......Copying bytes from one file to another

import java.io.*;
class CopyBytes
{
    public static void main(String[] args)
    {
        FileInputStream infile = null;
        FileOutputStream outfile = null;
        byte byteRead;
        try
        {
            infile = new FileInputStream("in.txt");
            outfile = new FileOutputStream("out.txt");
            do {
                byteRead = (byte)infile.read();
                outfile.write(byteRead);
            }
            while(byteRead != -1);
            }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            try
            {
                infile.close();
                outfile.close();
            }
            catch (IOException e)
            {}
        }
    }
}
//Program 2.6........Storing and retrieving integer using data streams on single file
import java.io.*;
class ReadWriteInteger
{
    public static void main(String[] args)
    {
        DataInputStream dis = null;
        DataOutputStream dos = null;
        File inFile = new File("rand.txt");
        try
        {
            dos = new DataOutputStream(new FileOutputStream(inFile));
            for(int i = 0; i < 20; i++)
            dos.writeInt((int)(Math.random()*100));

        }
        catch(IOException ioe)
        {
            System.out.println(ioe.getMessage());
        }
        finally
        {
            try
            {
                dos.close();
            }
            catch(IOException ioe)
            {}
        }
        try
        {
            dis = new DataInputStream(new FileInputStream(inFile));
            for(int i = 0; i < 20; i++)
            {
                int n = dis.readInt();
                System.out.print(n+" ");
            }
        }
        catch(IOException ioe)
        {
            System.out.println(ioe.getMessage());
        }
        finally
        {
            try
            {
                dis.close();

            }
            catch(IOException ioe)
            {}
        }
    }
}
//Program2.9........Appending to text file using random access
import java.io.*;
class RandomAccess
{
    public static void  main(String[] args)
    {
        RandomAccessFile rFile;
        try {
            rFile = new RandomAccessFile("city.txt", "rw");
            rFile.seek(rFile.length());
            rFile.writeBytes("\nMUMBAI\n");
            rFile.close();
        }
        catch(IOException ioe)
        {
            System.out.println(ioe);
        }
    }
}
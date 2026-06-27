//Program 2.2...........Writing bytes to file
import java.io.*;
class WriteBytes
{
    public static void main(String args[])
    {
        //Declare and intialize the byte array
        byte cities[] = {'D','E','L','H','I','\n','M','A','D','R','A','S','\n','L','O','N','D','O','N','\n'};
        //creates an output stream
        FileOutputStream outfile = null;
        try
        {
            outfile = new FileOutputStream("city.txt");
            outfile.write(cities);
            outfile.close();
        }
        catch(IOException ioe)
        {
            System.out.println(ioe);
            System.exit(-1);
        }
    }
}
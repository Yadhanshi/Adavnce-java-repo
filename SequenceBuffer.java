//Program 2.7...Concatenating and buffering files

import java.io.*;
class SequenceBuffer
{
    public static void main(String[] args)
    {
        FileInputStream file1 = null;
        FileInputStream file2 = null;

        SequenceInputStream file3 = null;
        try
        {
            file1 = new FileInputStream("text1.txt");
            file2 = new FileInputStream("text2.txt");
            //conacte file 1 and file 2 into file 3

            file3 = new SequenceInputStream(file1, file2);
            BufferedInputStream inBuffer = new BufferedInputStream(file3);
            BufferedOutputStream outBuffer = new BufferedOutputStream(System.out);


            int ch;
            while ((ch = inBuffer.read()) != -1)
            {
                outBuffer.write((char) ch);
            }

            inBuffer.close();
            outBuffer.close();
            file1.close();
            file2.close();
            }
        catch (IOException ioe)
        {
            System.out.println("IOException");
        }



        }
}
//Program 2.5.......//Reading and writing primitive data

import java.io.*;
class ReadWritePrimitive
{
    public static void main(String[] args) throws IOException
    {
        File primitive = new File("prim.txt");
        FileOutputStream fos = new FileOutputStream(primitive);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeInt(1999);
        dos.writeDouble(375.85);
        dos.writeBoolean(false);
        dos.writeChar('X');
        dos.close();
        fos.close();
        FileInputStream fis = new FileInputStream(primitive);
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readChar());
        dis.close();
        fis.close();

    }
}
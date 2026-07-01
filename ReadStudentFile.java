//Program 2.12
import java.io.*;
import java.awt.*;
class ReadStudentFile extends Frame
{
    //Defining window component
    TextField number,name,marks;
    Button next,done;
    Label numLabel,nameLabel,marksLabel;
    DataInputStream dis;
    boolean moreRecords = true;
    //intialize the frame
    public  ReadStudentFile()
    {
        super("Create Student File");
    }
    //setup the window
    public void setup() {
        resize(400, 200);
        setLayout(new GridLayout(4, 2));
        //create component of frame
        number = new TextField(25);
        numLabel = new Label("Roll Number");
        name = new TextField(25);
        nameLabel = new Label("Student Name");
        marks = new TextField(25);
        marksLabel = new Label("Marks");
        next = new Button("NEXT");
        done = new Button("DONE");
        //Add component to the frame
        add(numLabel);
        add(number);
        add(nameLabel);
        add(name);
        add(marksLabel);
        add(marks);
        add(next);
        add(done);
        show();

        try
        {
            dis = new DataInputStream(new FileInputStream("student.txt"));
        }
        catch (IOException e)
        {
            System.err.println(e.toString());
            System.exit(1);
        }
    }
    public void readRecord() {
        int n;
        String s;
        double d;
        try {
            n = dis.readInt();
            s = dis.readUTF();
            d = dis.readDouble();
            number.setText(String.valueOf(n));
            name.setText(String.valueOf(s));
            marks.setText(String.valueOf(d));
        } catch (EOFException e) {
            moreRecords = false;
        } catch (IOException ioe) {
            System.out.println("IO ERROR");
            System.exit(1);
        }
    }
        public void cleanup()
        {
            try
            {
                dis.close();
            }
            catch(IOException e)
            {}
        }
        public boolean action(Event event, Object o)
        {
            if(event.target instanceof Button)
            {
                if(event.arg.equals("NEXT"))
                    readRecord();
            }
            return true;
        }
        public boolean handleEvent(Event event)
        {
            if(event.target instanceof Button)
            {
                if(event.arg.equals("DONE")|| moreRecords == false)
                {
                    cleanup();
                    System.exit(0);
                    return true;
                }
            }
            return super.handleEvent(event);
        }

        public static void main(String args[])
        {
            ReadStudentFile student = new ReadStudentFile();
            student.setup();
        }

}
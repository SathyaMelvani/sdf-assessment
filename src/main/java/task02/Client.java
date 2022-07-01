package task02;
import java.net.*;
import java.io.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Client 
{
    public static void main( String[] args ) throws IOException
    {

        System.out.println("Connect to sdf.chuklee.com at port 80");

        
        Socket s = new Socket("68.183.239.26", 80 );

        OutputStream OS = s.getOutputStream();
        DataOutputStream DOS = new DataOutputStream(OS);

        ObjectOutputStream OOS = s.getObjectOutputStream();
        ObjectInputStream OIS = s.getObjectInputStream();
        
        DOS.writeUTF("Request ID");
        DOS.flush();

        DOS.writeUTF("Sathya Mahesh Melvani");
        DOS.flush();

        DOS.writeFloat("Average Numbers");
        DOS.flush();

        
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);




        System.out.println("SUCCESS");



            
        }


    }


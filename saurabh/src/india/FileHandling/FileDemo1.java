package india.FileHandling;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo1 
{
	public static void main(String[] args) throws IOException 
	{
	FileOutputStream fos=new FileOutputStream("C:\\Users\\saurabh\\Desktop\\college project final\\saurabh.text");
	DataOutputStream dos=new DataOutputStream(fos);
	dos.writeUTF("this file about saurabh");
	dos.close();
	
	FileInputStream fis=new FileInputStream("C:\\Users\\saurabh\\Desktop\\college project final\\saurabh.text");
	DataInputStream dis=new DataInputStream(fis);
	String str=dis.readUTF();
	dis.close();
	System.out.println(str);
	
	
	}
}

package india.FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Properties;

public class Property_files 
{
	public static void main(String[] args) throws Exception 
	{
		Properties p=new Properties();
		/*OutputStream os=new FileOutputStream("C:\\Users\\saurabh\\Desktop\\college project final\\sattu.properties");
		p.setProperty("url", "www.google.co.in");
		p.setProperty("name", "saurabh");
		p.setProperty("age", "104");
		p.store(os, null);9910196579 sujata mksmartine 
		hiduja global solution 7300066402 bhaskar
		
		//to store outside data		*/
		
		InputStream is=new FileInputStream("C:\\Users\\saurabh\\Desktop\\college project final\\sattu.properties");
		p.load(is);
		for (String str : args)
		{
			System.out.println(str);
		}
			
	}

}

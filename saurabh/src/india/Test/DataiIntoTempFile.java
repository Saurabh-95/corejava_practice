package india.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataiIntoTempFile
{
	public static void main(String[] args) 
	{
		File tempfile=null;
		BufferedWriter writer=null;
		try
		{
			tempfile=File.createTempFile("My Temp File", ".temp");
			writer=new BufferedWriter(new FileWriter(tempfile));
			writer.write("hello sivangi");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				if(writer!=null)
					writer.close();
			}
			catch(Exception ex)
			{
				
			}
		}
		System.out.println("store data in temprory in file");
		
	}

}

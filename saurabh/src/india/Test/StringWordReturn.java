package india.Test;

public class StringWordReturn 
{

	public static void main(String[] args) 
	{
String s1="sattu singh chutiya hai";
String[]word=s1.split(" ");
		for(int i=word.length-1;i>=0;i--)
		{
			System.out.println(word[i]);
		}
	}

}

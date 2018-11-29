package india.string.Reverse_string;

public class Reverse4 
{
	public static void main(String[] args) 
	{
		String s="sayendra";
		char []temp=s.toCharArray();
		
		int j=temp.length-1;
		for(int i=0;i<j;i++,j--)
		{
			char a=temp[i];
			temp[i]=temp[j];
			temp[j]=a;
		}
		for (char c : temp)
		{
			System.out.print(c);
			//System.out.println();
		}
		
	}

}

package india.Test;

public class PatternAppAmplify2 
{
	public static void main(String[] args) 
	{
		int len=5;
		for(int i=1;i<=len;i++)
		{
			int c=len-1;
			System.out.print(i);
			int rec=c+i;
			for(int j=1;j<i;j++)
			{
				System.out.print(" "+rec);
				c--;
				rec=rec+c;
			}
			System.out.println();
		}
	}

}

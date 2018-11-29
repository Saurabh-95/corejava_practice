package india.Test;

public class PatternAppAmplify1
{
	static void printPattern(int n)
	{
		for(int i=2;i<=n;i=i+2)
		{
			int a=i;
			int b=i;
			while(a>0)
			{
				System.out.print("* ");
				a--;
			}
			System.out.println();
			while(b>0)
			{
			System.out.print("* ");
			b--;
			}
			System.out.println();
		}
	}
	static void optimized(int n)
	{	int k=0;
		for(int i=0;i<n;i++)
		{
			if(i==0||i%2==0)
			{
				k=k+2;
			}
			for(int j=0;j<k;j++)
				System.out.print("*");
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		//printPattern(6);
		optimized(6);
	}

}

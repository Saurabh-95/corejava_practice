package india.ExceptonHandling;

public class Try_CatchDemo 
{
public static void main(String[] args)
{
	int i,j,k=0;
	i=8;
	j=0;
	try
	{
	k=i/j;
	}
	catch(Exception e)
	{
	//System.out.println(e);
		System.out.println("con't divide by zero");
		System.out.println("this is unchecked exeption");
	}
	System.out.println(k);
}
}

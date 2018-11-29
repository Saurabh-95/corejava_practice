package india.Test;

public class EvenOdd 
{
static void check(int n)
{
	if((n&1)==1)
		System.out.println(n+" is Odd");
	else
		System.out.println(n+" is Even");
}
	public static void main(String[] args) 
	{
		check(3);
	}
	
}

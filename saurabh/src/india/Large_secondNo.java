package india;
import java.util.Scanner;

public class Large_secondNo 
{
	public static void main(String[] args) 
	{
		int fl=0 ,sl;
		System.out.println("enter the no's of array" );
		Scanner sc=new Scanner(System.in);
		int [] abc=new int[10];
		
		for( int i=0;i<5;i++)
		{
			abc[i]=Integer.parseInt(sc.next());
		}
		
		
		for(int i=0;i<=5;i++)
		{
		if (abc[i]>abc[i+1])
		{
			sl=abc[i];
			abc[i]=abc[i+1];
			abc[i+1]=sl;
		}
	}
		System.out.println("arange no is");
		System.out.println(abc[4]);
		System.out.println(abc[5]);

}
}
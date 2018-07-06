import java.util.*;
public class PrimeNotest 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the nos of prime u want to show:-");
		Scanner sc=new Scanner(System.in);
		int abc=Integer.parseInt(sc.next());
		int ab=0;
		
		
		for(int i=2;i<=5000;i++)
		{
			 int count=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
				count++;
				break;
				}
			}
				if(count==0)
				{
				System.out.println(i);
				ab++;	
				}
				if(ab==abc)
					break;
				sc.close();
		}
	}

}

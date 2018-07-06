package india.string;

public class MatchingPattenDemo1
{
	public static void main(String[] args) 
	{
		String s1="saur";
		String s2="sa";
		int count=0;
		
	//	boolean result=false;
		int l1=s1.length();
		int l2=s2.length();
		char s,p;
		for(int i=0;i<=l1-l2;i++)
		{
			s=s1.charAt(i);
			p=s2.charAt(0);
			if(s==p)
			{
				for(int j=i,k=0;j<i-l2;i++,k++)
				{
					s=s1.charAt(j);
					p=s2.charAt(k);
					if(s==p)
						count++;
					
				}
			}
		}
		if(count==l2)
			System.out.println("matched");
		else
			System.out.println("not match");
		
	}

}

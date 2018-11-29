package india.Test;

public class ReverseWord1 
{
	public static void main(String[] args) 
	{
		String s=" saurabh is gone";
		char arr[]=s.toCharArray();
		int len=arr.length-1;
		String temp="";
		for(int i=0;i<=len;i++)
		{
			if(arr[i]==' '||i==len)
			{
				int j=i;
				if(i==len)
				{
					temp=temp+' ';
				}
				while(true)
				{
					temp=temp+arr[j];
					j--;
					if(j==-1||arr[j]==' ')
						break;
						
				}
			}
		}
		System.out.println(temp);
		
	}

}

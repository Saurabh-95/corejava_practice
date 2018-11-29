package india.Test;

public class HighestMultiInArray
{
	
	static void max(int []arr)
	{
		int  m=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int result=arr[i]*arr[j];
				if(m<result)
					m=result;
			}
			
			
		}
		System.out.println(m);
		
	}

		public static void main(String[] args) 
		{
			int a[]= {1,2,3,4,5,8,3,4};
			max(a);
		}
}

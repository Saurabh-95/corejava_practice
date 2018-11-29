package india.SortandSearch.testsorting;

public class Array_Insertion 
{
	public static void main(String[] args) 
	{	int arr[]=new int [10];
		 arr[0]=1;
		 arr[1]=2;
		 arr[2]=3;
		 arr[3]=5;
		 arr[4]=6;
		 arr[5]=7;
		  
		int item=4;
		int index=3;
		for(int i=5;i>=index;i--)
		{
			arr[i+1]=arr[i];
			
		}
		arr[index]=item;
		for(int i=0;i<7;i++)
		System.out.println(arr[i]);
		
		
	}
}

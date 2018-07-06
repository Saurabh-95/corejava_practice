package india.SortandSearch;

public class Bubble_sort 
{
	void bsort(int A[],int n)
	{
		int i,round,temp;
		for(round=0;round<n-1;round++)
			for(i=0;i<n-1-round;i++)
				if(A[i]>A[i+1])
				{
					temp=A[i];
					A[i]=A[i+1];
					A[i+1]=temp;	
				}
			
		
		
	}
	
	public static void main(String[] args) 
	{
	int Array[]= {15,34,29,8};
	Bubble_sort obj=new Bubble_sort();
	obj.bsort(Array, 4);
   
	for(int i=0;i<4;i++)
	   System.out.println(Array[i]);
	}
	

}

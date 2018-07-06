package india.SortandSearch;

public class Selection_sort 
{
	int min(int A[],int k,int N) 
	{
		int loc,j,MIN;
		MIN=A[k];
		loc=k;
		for(j=k+1;j<=N-1;j++)
			if(MIN>A[j])
			{
				MIN=A[j];
				loc=j;
			}
		return loc;
	}
	
	public static void main(String[] args) 
	{
		int Array[]= {33,11,66,88,44,1};
		int k,temp,loc;
		Selection_sort obj=new Selection_sort();
		
		for(k=0;k<=4;k++) 
		{
			loc=obj.min(Array,k,6);
			temp=Array[k];
			Array[k]=Array[loc];
			Array[loc]=temp;
		}
		for(k=0;k<=5;k++)
			System.out.println(Array[k]);
		
	}

}

package india.SortandSearch;

public class Insertion_sort 
{
	void INS_SORT(int A[],int n)
	{
		int i,j,temp;
		for(i=1;i<n;i++)
		{
			temp=A[i];
			for(j=i-1;j>=0 &&temp<A[j];j--)
			{
				A[j+1]=A[j];
			}
			A[j+1]=temp;
		}
		
		
	}
	public static void main(String[] args) 
	{
	int Array[]= {34,45,11,89,55,19,22,8,40};
	Insertion_sort obj=new Insertion_sort();
	obj.INS_SORT(Array, 9);
	for(int i=0;i<9;i++)
	{
		System.out.println(Array[i]);
	}
	}

}

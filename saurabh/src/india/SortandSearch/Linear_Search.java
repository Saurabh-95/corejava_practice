package india.SortandSearch;

public class Linear_Search 
{
int LnrShort(int A[],int target,int n)
{
	
	for( int i=0;i<n-1;i++)
	{
		if(A[i]==target)
		{
			return i;
		
		}
		
	}
	return -1;
	
}
public static void main(String[] args) 
{
	Linear_Search obj=new Linear_Search();
	int Array[]= {5,8,6,7,9,4,3,2};
	int target=1;
	int n=8;
	int a =obj.LnrShort(Array, target, n);
	System.out.println(a);
	
}

}

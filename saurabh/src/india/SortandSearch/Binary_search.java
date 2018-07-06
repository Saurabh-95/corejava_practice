package india.SortandSearch;


public class Binary_search
{
 int B_search(int A[],int target,int n)
 {
	 int max=n-1;
	 int min=0;
	 int guess;/*  hold the index values */
	 int step=0;
	 while(max>=min)
	 {
		 guess=(max+min)/2;
		 step++;
		 
		 if( A[guess]==target)
		 {
			 System.out.println("no of step is require to search  " +step);
			 return guess;
		 }
		 else if(A[guess]>target)
		 {
			 max=guess-1;
		 }
		 else
		 {
			 min=guess+1;
		 }
	 }
	 
	 return -1;
 }
 
 public static void main(String[] args)
 {
	int Array[]= {2,3,5,6,7,8,9,12,15,17,20,22};
	int n=12;
	int target=2;
	Binary_search obj=new Binary_search();
	int res=obj.B_search(Array, target, n);
	if(res==-1) 
	{
		System.out.println("element not found");
		
	}
	else {
		System.out.println("values is  "+res+"  index");
	}
}
 
}

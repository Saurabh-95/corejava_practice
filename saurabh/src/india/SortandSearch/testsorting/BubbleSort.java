package india.SortandSearch.testsorting;

public class BubbleSort 
{
 int[] Bubble_Sort(int a[],int l)
 {
	 int temp;
	 if(a.length==0)
	 {
		 return null;
	 }
	 else if(a.length==1) 
	 {
		return a;
	 }
	 else {
	 for(int i=0;i<=l-1;i++)
	 {
		 for(int j=0;j<=l-2;j++)
		 {
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		 }
	 }
	 }
	 return a;
 }
 public static void main(String[] args) 
 {
	 int arr[]= {};
	 int length=arr.length;
	 BubbleSort bs=new BubbleSort();
	 bs.Bubble_Sort(arr,length);
	// System.out.print("Sorted elements are:- ");
	 for (int i : arr) 
	 {
		System.out.println(i);
	}
	 
	
 }
	

}

package india.SortandSearch.testsorting;

public class SelectionSort 
{
	void Sel_sort(int a[],int k ,int l)
	{
		int loc,Min;
		Min=a[k];
		loc=k;
		for (int i =k+1; i < l-1; i++) 
		{
			if(Min>a[i])
			{
				Min=a[i];
				loc=i;
			}
		}
		
	}
	public static void main(String[] args) 
	{
		SelectionSort ss=new SelectionSort();
		int arr[]= {1,5,3,8,4,2,6};
		int len=arr.length;
		int initial=0;
		ss.Sel_sort(arr, initial, len);
		for (int i : arr) 
		{
			System.out.println(i);
		}
	}
}

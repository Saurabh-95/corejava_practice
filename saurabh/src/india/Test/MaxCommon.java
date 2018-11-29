package india.Test;

public class MaxCommon

{
 static void getMaxCommon(int[]a,int b[])
 {
	 int l1=a.length-1;
	 int l2=b.length-1;
	 int[]c=new int[200];
	 int n=0;
	int max=0;
	 for(int i=0;i<=l1;i++)
		 for(int j=0;j<=l2;j++)
		 {
			 if(a[i]==b[j])
			 {
				if(max<a[i]) 
				max=a[i];
			 }
		 }
	
	 System.out.println("the maximum no="+max);
 }
 public static void main(String[] args)
 {
	 int[]A= {1,2,3,4,8,9};
	 int[]B= {4,5,6,8,9,7};
	 getMaxCommon(A, B);
 }
}

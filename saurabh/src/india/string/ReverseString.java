package india.string;

import java.util.Scanner;

public class ReverseString 
{
public static void main(String[] args) 
{
	String original;
	String reverse=" ";
	System.out.print(" enter string to Reverse: ");
	Scanner sc =new Scanner(System.in) ;
	original=sc.nextLine();
	int len=original.length();
	
	for(int i=len-1;i>=0;i--)
		reverse=reverse+original.charAt(i);
	System.out.println("Original String is: "+original);
	System.out.println("Reverse String is :"+reverse);
	
}
}

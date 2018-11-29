package india.string.Reverse_string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversStringUsingListInterface 
{
public static void main(String[] args)
	{
	 String s="i am saurabh shukla";
	 String[]str=s.split(" ");
//	int l=str.length-1;
//	for(int i=l;i>=0;i--)
//	{
//		System.out.println(str[i]);
//	}
	 List<String> list=Arrays.asList(str);
	 System.out.println(list);
	 Collections.reverse(list);
	// System.out.println(list);
	 for (String items : list) 
	 {
		System.out.println(items);
	 }
	
	}
}

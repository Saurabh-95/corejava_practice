package india.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class collection_List 
{
	public static void main(String[] args)
	{
	List<Integer> l1=new ArrayList<Integer>();
	l1.add(80);
	l1.add(30);
	l1.add(10);
	l1.add(60);
	l1.add(20);
	Collections.sort(l1);
		
//	for (int i : l1) 
//	{
//		System.out.println(i);
//	}
//	
	// we can use another way
	l1.forEach(System.out::println);
	}
}

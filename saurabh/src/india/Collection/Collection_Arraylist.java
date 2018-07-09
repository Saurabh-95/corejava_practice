package india.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_Arraylist 
{
	public static void main(String[] args)
	{
	//Collection values=new ArrayList();
	Collection<Integer> values=new ArrayList<Integer>();
	//values.add("saurabh");
	values.add(001);
	//values.add(4.5f);
	//values.add('c');
	values.add(77);
	//values.remove(4.5f);
	//for print the values
	//***************
//	Iterator i=values.iterator();
//	while(i.hasNext())
//	{
//	System.out.println(i.next());
//	} 
	
	//we have advance method "enhance for loop 
	//for(int i:values)with the generic type of collection
	for (int i : values) 
	{
		System.out.println(i);
	}
	
	
	}

}

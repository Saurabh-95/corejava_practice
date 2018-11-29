package india.Collection.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class collection_arraylist_Test1
{
	public static void main(String[] args) 
	{
		
		
		Collection<String> name=new ArrayList<>();
		name.add("saurabh");
		name.add("amit");
		name.add("vikas");
		name.add("vikky");
		name.add("ram");
		//Collections.synchronizedCollection(name);
		
		boolean b=name.contains("vikas");
		
	
		Iterator<String> i=name.iterator();
		while(i.hasNext()) 
		{
		
		if(i.next().equals("vikas"))
		{
			i.remove();
		}
		}
		System.out.println(name);
		/*System.out.println(b);
		for (String s : name)
		{
			System.out.println(s);
		}*/
	}
// till collection with arraylist
		
		
	/*	
		List<String> name=new ArrayList<>();
		name.add(0, "saurabh");
		name.add("saurabh");
		name.add("amit");
		name.add("vikas");
		int i=name.size();
		int j=name.indexOf("vikas");
		System.out.println(i+"="+j);
		name.remove(1);
		Collections.synchronizedList(name);
		System.out.println(name);
		for (String s : name)
		{
		 System.out.println(s);
		 
		}*/
	//	name.forEach(System.out::println);//lambda opretor
		
		//till List interface
		
		/*
		List<String> name=new Vector<>();
		name.add("saurabh");
		name.add("amit");
		name.add("vikas");
		name.add("vikas");
		Collections.sort(name);
		Iterator<String> it=name.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		Vector<String> name=new Vector<>();
		int i=name.capacity();
		System.out.println(i);

		*/
 
	


}
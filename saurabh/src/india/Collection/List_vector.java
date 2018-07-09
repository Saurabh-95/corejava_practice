package india.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class List_vector 
{
public static void main(String[] args) 
{
	Vector<Integer> v=new Vector<Integer>();
	v.add(5);
	v.add(10);
	v.add(20);
	v.add(50);
	v.add(0);
	v.add(100);
	
	v.remove(2);
	Collections.sort(v);
	System.out.println(v.capacity());
	v.forEach(System.out::println);
	
	
	List<String> L=new ArrayList<String>();
	L.add("saurabh");
	L.add("Amit");
	L.add("gagan");
	L.add("vinay");
	L.add("leena");
	Collections.sort(L);
	L.forEach(System.out::println);
}	
}

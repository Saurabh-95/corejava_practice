package india.Collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set_interface 
{
	public static void main(String[] args)
	{
		//Set<Integer> s=new HashSet<>();
		Set<Integer> s=new TreeSet<>();
		s.add(5);
		s.add(6);
		s.add(7);
		s.add(12);
		s.add(50);
		//Collections.reverse(s);
		
		
		for ( int i: s) 
		{
		System.out.println(i);	
		}
	}

}

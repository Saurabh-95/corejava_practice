package india.string.Reverse_string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Reverse5 
{
	public static void main(String[] args) 
	{
		String s ="shivangi";
		char[]s1=s.toCharArray();
		List<Character> list=new ArrayList<>();
		for (Character s1_char : s1) 
		{
			list.add(s1_char);
		}
		Collections.reverse(list);
		ListIterator<Character> list_iter=list.listIterator();
		while(list_iter.hasNext())
		{
			System.out.println(list_iter.next());
		}
		
	}

}

package india.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Double_brace_List 
{
	public static void main(String[] args) 
	{
//	List<Integer> list=new ArrayList<>();
//	list.add(520);
//	list.add(20);
//	list.add(522);
//	list.add(50);
		//or if u konw the values
		//List<Integer> list=Arrays.asList(50,60,55,70);
		
		List<Integer> list=new ArrayList<Integer>()//here integer must be right
				{{
					add(50);		//1st { is anonymous class and 2nd { is instance initialization block 
					add(0);
					add(55);
				}};
		
	
	for (int i : list) 
	{
		System.out.println(i);
	}
			
	}
}

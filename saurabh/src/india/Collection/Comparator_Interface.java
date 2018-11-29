package india.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Comparator_Interface 
{
 public static void main(String[] args) 
 {
	List<Integer> l=new ArrayList<Integer>();
	l.add(502);
	l.add(100);
	l.add(631);
	l.add(356);
	l.add(244);
	l.add(625);
	
	//Collections.reverse(l);
	
	Comparator<Integer> com=new comparatorImpl();
	Collections.sort(l, com);
	/*Or*/
	//Comparator<Integer>com=new Comparator<Integer>() 
	//this is anonymous class 
//	{
//		public int compare(Integer o1,Integer o2)
//		{
//			if(o1%10>o2%10)
//				return 1;
//			return -1;
//		}
//	};
	///OR
			/*Lambda Expression*/
	//Comparator<Integer> com=(o1,o2)->
	{

//		if(o1%100>o2%100)
//			return 1;
//		return -1;
		//we can also use ternary operator 
		//return o1%10>o2%10?1:-1;
	};
			
//	Collections.sort(l,(o1,o2)->
//	{
//		return o1%10>o2%10?1:-1;	
//	});	
	
	
	
	
	for (int i : l) 
	{
		System.out.println(i);
	}
	//l.forEach(System.out::println);
	
 }
}

class comparatorImpl implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		//if(o1%100>o2%100)//sort according last 2 digit
			//if(o1%10>o2%10)// sort according last didgit
		if(o1>o2)//sort according whole digit
			return 1;
		return -1;
	}
	
}
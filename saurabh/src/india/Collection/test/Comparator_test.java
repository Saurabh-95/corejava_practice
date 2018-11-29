package india.Collection.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_test
{
	public static void main(String[] args) 
	{
		List<Number> num=new ArrayList<>();
		num.add(5);
		num.add(4);
		num.add(1);
		num.add(9);
		num.add(88);
		 Comparator<Number> s=new sattu();
		Collections.sort(num, s);
		for (Number n : num) 
		{
			System.out.println(n);
		}
		
	}
}
class sattu implements  Comparator<Number>
{

	@Override
	public int compare(Number o1, Number o2) 
	{
		if((o1.intValue())%10>(o2.intValue())%10)
		return 1;
		return -1;
	}

	
}

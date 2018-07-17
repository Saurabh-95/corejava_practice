package india.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class test1
{
	public static void main(String[] args) 
	{
	List<student1> s=new ArrayList<>();
	s.add(new student1(1, "saurabh", 300));
	s.add(new student1(2, "amit", 250));
	s.add(new student1(3, "sattu", 280));
	Comparator<Integer> c=new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) 
		{
			
			return 0;
		}
	};
	
	}
}
class student1 
{
	int id;
	String name ;
	int marks;
	
	public student1(int id, String name, int marks)
	{
		
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	
	
}

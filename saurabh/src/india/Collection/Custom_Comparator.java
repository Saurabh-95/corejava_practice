package india.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Custom_Comparator 
{
	public static void main(String[] args) 
	{
		List<student> list=new ArrayList<>();
		list.add(new student(1, 88));
		list.add(new student(2, 50));
		list.add(new student(3, 71));
		list.add(new student(4, 98));
		
		Collections.sort(list,(s1,s2)->
		{
			return s1.marks>s2.marks?-1:s1.marks<s2.marks?1:0;
			
		});
		for (student s : list)
		{
			System.out.println(s);
		}
		
	}

}
class student
{
	int rollno;
	int marks;
	student(int rollno,int marks)
	{
		this.rollno=rollno;
		this.marks=marks;
	}
	@Override
	public String toString() 
	{
		return "student [rollno=" + rollno + ", marks=" + marks + "]";
	}
	
}

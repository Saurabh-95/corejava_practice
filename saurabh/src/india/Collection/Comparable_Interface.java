package india.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable_Interface
{
	public static void main(String[] args)
	{
		List<students> stud=new ArrayList<>();
		stud.add(new students(1, 35));
		stud.add(new students(2, 40));
		stud.add(new students(3, 50));
		stud.add(new students(4, 30));
		Collections.sort(stud);
		for (students st : stud)
		{
			System.out.println(st);
			
		}
		
	}
}
class students implements Comparable<students >
{
	int roolno;
	int marks;
	
	public students(int roolno, int marks) 
	{
		this.roolno = roolno;
		this.marks = marks;
	}

	@Override
	public int compareTo(students s) {
		
		return this.marks>s.marks?-1:this.marks<s.marks?1:0;
	}
	
}

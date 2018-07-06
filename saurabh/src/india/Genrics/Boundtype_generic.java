package india.Genrics;

public class Boundtype_generic
{
	static <V,T extends Number> void Display(T rollno,V name )// T is bounded with Number class 
	{
		System.out.println(rollno.getClass().getName()+":"+rollno);
		System.out.println(name.getClass().getName()+":"+name);
	}
	public static void main(String[] args) 
	{
	Display(1, "saurabh");
		
	}

}

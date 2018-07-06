package india.Genrics;

public class GenericMethod_Demo 
{
	static  <S1>void display(S1 obj)
	{
		System.out.println(obj);
		System.out.println(obj.getClass().getName());
	}
	static <T1,T2> void show(T1 name,T2 rollno)	
	{
		System.out.println("Student details: Name-"+name+", Rollno-"+rollno );
	}
	public static void main(String[] args) 
	{
		//GenericMethod_Demo.display(100);
		//display("saurabh");
		show(2,"saurabh");
	}

}

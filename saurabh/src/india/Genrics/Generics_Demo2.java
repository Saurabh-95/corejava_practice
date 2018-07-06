package india.Genrics;

public class Generics_Demo2 
{
	public static void main(String[] args)
	{
		new MyGen<Integer,String,Integer>(100,"saurabh",23);	
	}

}
class MyGen<T1,T2,T3>
{
	T1 rollno;
	T2 name;
	T3 age;
	public MyGen(T1 rollno,T2 name,T3 age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		System.out.println("student details: Rollno.-"+rollno+" ,name-"+name+",Age-"+age);
		
	}
}

package india.Oops.abstraction;

public class abstraction1 
{
 public static void main(String[] args) 
 {
	student obj =new Details();
	obj.age();
	obj.course();
	obj.name();
 }
}
 abstract class Person
{
	 void msg()
	 {
		 System.out.println("hello");
	 }
	 
	 abstract void name();
	 abstract void age();
}
  abstract class student extends Person 
 {
   abstract  void course();
   
 }
  
  class Details extends student
  {

	@Override
	void course() 
	{
		System.out.println("mca");
	}

	@Override
	void name() 
	{
	System.out.println("saurabh");
	}

	@Override
	void age() 
	{
		System.out.println("23");
	}
	  
  }

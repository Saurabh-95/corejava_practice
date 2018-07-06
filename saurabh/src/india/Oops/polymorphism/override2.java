package india.Oops.polymorphism;

public class override2 
{
public static void main(String[] args)
{
	Animal obj =new Dog();
	Animal a=   obj.mytype();
	System.out.println(a.getClass());
	
}
}
class Animal
{
	Animal mytype()
	{
		return new Animal();
	}
}
class Dog extends Animal
{
	Dog mytype()
	{
		return new Dog();
	}
}

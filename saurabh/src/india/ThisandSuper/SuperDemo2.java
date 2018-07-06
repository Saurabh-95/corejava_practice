package india.ThisandSuper;

public class SuperDemo2 
{
public static void main(String[] args) 
{
	new b(1);
}
}
class a
{
	a()
	{
		System.out.println(" constructor a");
	}
	a(int i)
	{
		System.out.println(" parameterise constructor a");
	}
}
class b extends a
{
	b()
	{
		System.out.println(" constructor b");
	}
	b(int i)
	{
		super(i);
		System.out.println(" parameterise constructor b");
	}
	
}
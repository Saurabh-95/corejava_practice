package india.Genrics;

public class GenericConstructor 
{
public static void main(String[] args) 
{
	Mygen2 obj=new Mygen2(002);
	obj.show();
}
}
class Mygen2
{
	private int value;
	<T extends Number> Mygen2(T name) 
	{
		value=name.intValue();
		
	}
	void show()
	{
		System.out.println(value);
	}
}

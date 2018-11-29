package india.Oops.polymorphism.test;


public class override_test1  extends one
{
	override_test1 show()
	{
	return new override_test1();	
		
	}
	
public static void main(String[] args) 
{
	
}

}


class one
{
	one show()
	{
		return new one();
	}
}



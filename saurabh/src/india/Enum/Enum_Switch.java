package india.Enum;

public class Enum_Switch 
{
	enum Mobile
	{
	 APPLE,NOKIA,SAMSUNG,HTC	
	}
	public static void main(String[] args) 
	{
		Mobile m=Mobile.APPLE;
		switch (m) 
		{
		case APPLE:
			System.out.println("this is an apple");
			break;
		case NOKIA:
			System.out.println("this is an Nokia");
			break;
		default:
			System.out.println("nothing");
			break;
		}
	}

}

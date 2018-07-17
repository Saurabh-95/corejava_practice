package india.Enum;
enum Mobile1
{
 APPLE(100),NOKIA(110),SAMSUNG(80),HTC(90);
	int price;

 Mobile1() 
 {
	price = 80;
	System.out.println("constructor");
 }
 Mobile1(int p)
 {
	 price=p;
 }
 
 
	public int getPrice()
	{
		return price;
	}
}

public class var_method_enum
{
	public static void main(String[] args) 
	{
		//System.out.println(Mobile1.SAMSUNG.ordinal());
		Mobile1 m1[]=Mobile1.values();
		for (Mobile1 mob : m1) 
		{
			System.out.println(mob);
		}
	}

}

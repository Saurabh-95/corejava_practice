package india.DesingPatterns.BuilderPattern;

public class Shop 
{
	public static void main(String[] args) 
	{
	 Phone p=new PhoneBuilder().setDisplay(5.5).setBattary(3011).setOs("andriod").getPhone();
	 System.out.println(p);
	}
}
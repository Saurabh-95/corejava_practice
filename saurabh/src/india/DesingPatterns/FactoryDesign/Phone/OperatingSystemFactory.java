package india.DesingPatterns.FactoryDesign.Phone;

public class OperatingSystemFactory 
{
	public Os getInstance(String str)
	{
		if(str.equals("open"))
		return new Andriod();
		
		else if(str.equals("closed"))
		return new Ios();
		
		else 
			return new Windows();
		
	}

}

package india.DesingPatterns.FactoryDesign;

import india.DesingPatterns.FactoryDesign.Phone.OperatingSystemFactory;
import india.DesingPatterns.FactoryDesign.Phone.Os;

public class Factory_Main 
{
public static void main(String[] args)
{
	OperatingSystemFactory osf=new OperatingSystemFactory();
	Os obj=osf.getInstance(" ");
	obj.spec();
	
}
}

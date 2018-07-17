package india.DesingPatterns.AdapterDesing;

import india.DesingPatterns.AdapterDesing.Other.PiloPen;

public class PenAdapter implements Pen 
{
	PiloPen pp=new PiloPen();
	public void write(String str) 
	{
		pp.mark(str);
	}

}

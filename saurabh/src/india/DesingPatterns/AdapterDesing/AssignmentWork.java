package india.DesingPatterns.AdapterDesing;

public class AssignmentWork
{
	private Pen p;
	
	public Pen getP()
	{
		return p;
	}
	public void setP(Pen p)
	{
		this.p = p;
	}
	void wirteAssignment(String str)
	{
		p.write(str);
	}

}

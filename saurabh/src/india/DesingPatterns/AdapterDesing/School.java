package india.DesingPatterns.AdapterDesing;


public class School 
{
	public static void main(String[] args)
	{
		Pen p=new PenAdapter();
		AssignmentWork aw=new AssignmentWork();
	aw.setP(p);
	aw.wirteAssignment("i am saurabh");
	}
}

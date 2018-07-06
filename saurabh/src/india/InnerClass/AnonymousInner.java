package india.InnerClass;

public class AnonymousInner 
{
	public static void main(String[] args)
	{
		Anonyns obj=new Anonyns() 
		{
			void show()
			{
				System.out.println(" this ia Anonyms class");
				this.display();
			}
			void display()
			{
				System.out.println("inner display");
			}
		
		
		};
		obj.show();
		
		
	}

}
class Anonyns
{
	void show()
	{
		System.out.println(" this is simple class");
	}
}

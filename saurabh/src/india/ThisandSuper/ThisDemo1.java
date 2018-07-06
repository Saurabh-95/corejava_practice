package india.ThisandSuper;

public class ThisDemo1 
{
	int a,b,c;
	void area(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println("area is : "+(a+b+c));
	}
	public static void main(String[] args) 
	{
		ThisDemo1 obj =new ThisDemo1();
		obj.area(5, 5, 5);
		
		System.out.println(" "+obj.a+" "+obj.b+" "+obj.c);
		
	}
	

}

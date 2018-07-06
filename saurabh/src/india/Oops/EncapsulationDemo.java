package india.Oops;

import java.security.GeneralSecurityException;

public class EncapsulationDemo
{
	public static void main(String[] args) 
	{
		A obj=new A();
		obj.addIJ(5, 6);
		obj.setI(4);
		System.out.println(obj.getI()); 
		System.out.println(obj.getJ()); 
		
		
	}

}
class A
{
	private int i,j;
	public void setI(int x)
	{
		i=x;
	}
	public int addIJ(int x,int y) 
	{
		j=x+y;
		return j;
	}
	public int getI()
	{
		return i;
	}
	public int getJ()
	{
		return j;
	}
	
}

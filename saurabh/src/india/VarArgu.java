
package india;

public class VarArgu 
{
	public static void main(String[] args) 
	{
		Display obj =new Display();
		obj.show(5);
	}

}
class Display
{
	void show (int ...a)
	{
		for(int i:a)
		System.out.println(i);
	}
	void show (int a)
	{
		
		System.out.println("hehe ehehenl/fnlkwlck   :"+a);
	}
}

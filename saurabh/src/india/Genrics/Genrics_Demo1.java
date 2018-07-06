package india.Genrics;

public class Genrics_Demo1 
{
	
	public static void main(String[] args) 
	{
		MyGenrics<Integer> obj1=new MyGenrics<>(100);
		int i=obj1.getMygenric();
		System.out.println(i);
		MyGenrics<String> obj2=new MyGenrics<String>("hello");
		String str=obj2.getMygenric();
		System.out.println(str);	
		
	} 
	
}
class MyGenrics<T>
{
	T obj;
	
	public MyGenrics(T o) 
	{
		 obj=o;
	}
	public T getMygenric()
	{
		System.out.println(obj.getClass().getName());
		return obj;
	}
}

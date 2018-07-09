package india.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_interface 
{
	public static void main(String[] args)
	{
	Map<String, String> mp=new HashMap<>();
	mp.put("name", "saurabh");
	mp.put("actor", "ajay");
	mp.put("age", "45");
	mp.put("student", "sattu");
	mp.put("student", "sau");//replace value in print
	
	//System.out.println(mp); for simple print
	//System.out.println(mp.get("name")); print the value through key
	Set<String> keys=mp.keySet();
	for (String key : keys) 
	{
		System.out.println(key+" "+mp.get(key));
	}
	
	}
}

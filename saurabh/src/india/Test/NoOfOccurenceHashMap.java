package india.Test;

import java.util.HashMap;

public class NoOfOccurenceHashMap 
{
	public static void main(String[] args) {
		String s= "java";
		HashMap<String, Integer> counter = new HashMap();
		for(char c : s.toCharArray()){
			String str = c+"";
			if(!counter.containsKey(str)){
				counter.put(str, 1);
			}else{
				counter.put(str, counter.get(str)+1);
			}
		}
		System.out.println(counter);
	}
}

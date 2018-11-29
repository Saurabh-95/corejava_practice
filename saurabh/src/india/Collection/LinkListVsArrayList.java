package india.Collection;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class LinkListVsArrayList 
{
	public static void main(String[] args) 
	{/*
		List<String> names=new LinkedList<>();
		names.add("Rams");
		names.add("Posa");
		names.add("Chinni");
	    names.add("Allu");
		
	    System.out.println("list containts: "+names);
	    System.out.println("linked list size: "+names.size());
	    Iterator<String> i=names.listIterator();
	    while(i.hasNext())
	    {
	    	System.out.println(i.next());
	    }*/
		
	    // array to linklist
	   // List<String> names=new LinkedList<>();
		Vector<String> names=new Vector<>();
	    		names.add("Rams");
	    		names.add("Posa");
	    		names.add("Chinni");
	    	    names.add("Allu");
	    	 Enumeration<String> num=names.elements();
	    	 while(num.hasMoreElements())
	    	 {
	    		 System.out.println(num.nextElement());
	    	 }
	 
	    	    //ListIterator<String> i=names.listIterator();
	    	    
//	    		String []sname= {"Rams","Posa","Chinni","Allu"};
//	    		for (String s : sname) 
//	    		{
//	    			names.add(s);
//	    		}
//	    	    System.out.println("list containts: "+names);
//	    	    System.out.println("linked list size: "+names.size());
//	    	    while(i.hasPrevious())
//	    	    {
//	    	    	System.out.println(i.previous());
//	    	    }
                /* while(i.hasNext())
	    	    {
	    	    	System.out.println(i.next());
	    	    }*/
	    	 
	    	   
                 /*while(i.hasPrevious())
     	    	    {
     	    	    	System.out.println(i.previous());
     	    	    }*/
	/*	//linkedlist to array
		
		List<String> names=new LinkedList<>();
		names.add("Rams");
		names.add("Posa");
		names.add("Chinni");
	    names.add("Allu");
	    String sname[]=new String[names.size()];
	    sname=names.toArray(sname);
	    System.out.println(Arrays.toString(sname));
	    int []number= {1,5,3,4,9,7,8};
	    System.out.println(Arrays.toString(number));*/
	    
	}
}

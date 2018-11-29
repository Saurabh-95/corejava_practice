package india.ThisandSuper;

   class FinalDemo 
{
	final int i=50;
	
	public static void main(String[] args)
	{
	//	f obj=new f1();
	//	obj.show();
		
		FinalDemo fd=new FinalDemo();
		System.out.println(fd.i);
	}

	
}
  final class f
   {
	  
	   final void show()
	   {
		   System.out.println(" this is in f");
	   }
	   
	   
   }
   class f1  //not extends final class
   {
//	   void show ()//not override
//	   {
//		  System.out.println(" this is in f1");
//	   }
//	   
   }
    


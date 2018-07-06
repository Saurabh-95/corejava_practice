package india.string;

public class ToStringDemo 
{
	public static void main(String[] args)
	{
		Student s1=new Student(101," saurabh");
		//System.out.println("Rollno.:"+s1.rollNo +" Name:"+s1.name);
		System.out.println(s1);
		
	}

}
class Student
{
	int rollNo;
	String name;
	public Student(int rollNo, String name) {
		
		this.rollNo = rollNo;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	 
	
}


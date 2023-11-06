package encapsulation;

public class Main 
{
	public static void main (String[]args)
	{
		Employee x=new Employee();
		x.name="yesh";
		x.deptname="java_amber";
		x.location="bangalore";
		x.setEmp_id("abcd");
		System.out.println(x.name);
		System.out.println(x.deptname);
		System.out.println(x.location);
		System.out.println(x.getEmp_id());
		
	}

}
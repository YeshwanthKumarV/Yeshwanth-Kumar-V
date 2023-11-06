package encapsulation;

public class Employee 
{
	public String name;
	public String deptname;
	public String location;
	private String emp_id;
	
	public String getEmp_id()
	{
		return emp_id;
	}
	public void setEmp_id(String newEmp_id)
	{
		this.emp_id=newEmp_id;
	}
	

}
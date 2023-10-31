package yeshwanthh.java;

public class Employee
{
	 private int salary;
	 private int age;

	    public Employee(int salary,int age) 
	    {
	        this.salary = salary;
	        this.age=age;	    }
	    

	    public void name() {
	        System.out.println("my self YESH,working as an employee!");
	    }

	    public int getSalary() {
	        return salary;
	    }
	    public int getage() {
	        return age;
	    }
	    public void dept() {
	        System.out.println("IN the dept FULL STACK");
	    }
	    public static void main(String[] args) 
		{
	    	Employee emp = new Employee(40000,23);
	     
	        emp.name();
	        System.out.println("my salary: " + emp.getSalary());
	        System.out.println("my salary: " + emp.getage());
	        emp.dept();

	      
	       
	    }
	}



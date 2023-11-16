package com.array;

public class Main 
{
	public static void main(String[]args)
	{
		Employee[] details;
		details=new Employee[3];
		details[0]=new Employee(100,"abc","A");
		details[1]=new Employee(101,"xyz","B");
		details[2]=new Employee(102,"pqr","C");
		for(Employee i:details )
		{
			System.out.println(i.id+ " "+i.name+" "+i.loc);
		}
	}

}

package yeshwanthh.java;

public class Addition
{
	static int addition (int num1,int num2)
	{
		int x=num1+num2;
		return (x);
	}
	static int addition (int num1,int num2,int num3)
	{
		int y=num1+num2+num3;
		return(y);
	}
	
	
	public static void main(String[] args) 
	{
      int x= addition(5,4);
      int y= addition(10,20,30);
      
      System.out.println("the sum of two int is "+x);
      System.out.println("the sum of three int is "+y);
      
       
    }

}

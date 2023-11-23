package exception;

public class Exception_handling 
{
	public static void main(String[]args)
	{
		try {
		int []num= {0,1,2 };
		System.out.println("code");
		System.out.println(num[10]);
		}
		catch(Exception e)
		{
			System.out.println("something went wrong");
		}
		finally
		{
			System.out.println("printing finally with or without an error");
		}
	}


}

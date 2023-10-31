package yeshwanthh.java;

public class Prime 
{
	public static void main (String[]args)
	{
		//PRIME
		System.out.println(isprime(19));
		System.out.println(isprime(49));
	}
	public static boolean isprime(int n)
	{
		if (n==0)
		{
			return false;
		}
		if(n==1)
		{
			return false;
		}
	    for (int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
				
		}return true;
	 }
}

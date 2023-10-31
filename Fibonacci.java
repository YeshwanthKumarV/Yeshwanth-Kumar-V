package yeshwanthh.java;

public class Fibonacci 
{
	//fibonacci
			public static void main (String[]args)
			{
				fib(10);
			}
			public static void fib(int n)
			{
				int a=0;
				int b=1;
				int c=1;
				for(int i=0;i<n;i++)
				{
					System.out.print(a+" ");
					a=b;//1
					b=c;//2
					c=a+b;//3
				}	

}
}

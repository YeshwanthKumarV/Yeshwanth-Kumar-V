package yeshwanthh.java;

public class Palindrome
{
	public static void main(String[]args)
	{
	int r, newvalue=0,old;    
	  int n=454;
	  
	  old =n;    
	  while(n>0){    
	   r=n%10;  
	   newvalue=(newvalue*10)+r;    
	   n=n/10;    
	  }    
	  if(old==newvalue)    
	   System.out.println("palindrome number ");    
	  else    
	   System.out.println("not palindrome");    
	}

}

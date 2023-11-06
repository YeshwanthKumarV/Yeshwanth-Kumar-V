package encapsulation_package2;

import encapsulation_package1.Account;

public class Customer extends Account 
{
	public static void main (String[]args)
	{
		Customer x=new Customer();
		x.address="jpnagar bangalore";
		x.location="bangalore";
		x.setAcc_no("accno 123456");
		x.setIfsc_code("ifsccode 1234");
		x.amount=1234.22;
		System.out.println(x.address);
		System.out.println(x.location);
		System.out.println(x.amount);
		System.out.println(x.getAcc_no());
		System.out.println(x.getIfsc_code());
		
		
	}

}

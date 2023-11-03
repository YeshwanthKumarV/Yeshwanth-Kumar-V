package method_overriding;

public class Main 
{
	public static void main(String[]args)
	{
		Bank mybank=new Bank();
		Bank mysbi=new Sbi();
		Bank myhdfc=new Hdfc();
		Bank myicic=new Icic();
		mybank.loan_per_for_current_year();
		mysbi.loan_per_for_current_year();
		myhdfc.loan_per_for_current_year();
		myicic.loan_per_for_current_year();
	}

}

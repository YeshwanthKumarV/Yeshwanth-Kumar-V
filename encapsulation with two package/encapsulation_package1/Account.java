package encapsulation_package1;

public class Account 
{
	
    private String acc_no;
	private String ifsc_code;
	protected String address;
	protected String location;
	public double amount;
	
	public String getAcc_no()
	{
		return acc_no;
	}
	public void setAcc_no(String newAcc_no)
	{
		this.acc_no=newAcc_no;
	}
	public String getIfsc_code()
	{
		return ifsc_code;
	}
	public void setIfsc_code(String newIfsc_code)
	{
		this.ifsc_code=newIfsc_code;
	}
	protected void info()
	{
		System.out.println("info message");
	}

}

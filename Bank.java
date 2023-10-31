package yeshwanthh.java;

public class Bank 
{
	int reg_no;
	String bank_loc;
	public Bank(int regNO,String loc)
	{
		reg_no=regNO;
		bank_loc=loc;
	}
	public static void main(String[] args) 
	{
    	Bank x = new Bank(12345,"bangalore");
     
       
        System.out.println("bank regno is " + x.reg_no);
        System.out.println("bank location is : " + x.bank_loc);
       
      
       
    }

}

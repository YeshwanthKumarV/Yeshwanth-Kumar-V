package coupling;

public class Person 
{
	public static void main(String args[])
	{
		Examination gift1=new Bike();
		Examination gift2=new Cycle();
		For_single_output newgift=new Single_out_put(gift1);
		newgift.single_out_put();
	}

}

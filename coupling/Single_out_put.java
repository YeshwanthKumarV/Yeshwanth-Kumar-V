package coupling;

public class Single_out_put implements For_single_output 
{
	private Examination Examination;
	Single_out_put(Examination Examination)
	{
		this.Examination =Examination;
	}

	@Override
	public void single_out_put() 
	{
		Examination.gift();
				
	}

}

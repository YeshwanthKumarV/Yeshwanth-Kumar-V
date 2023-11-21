package builder_n_buffer;

public class Reverse_using_builder 
{
	public static void main(String[] args)
	{
		String str="yesh";
		System.out.println(reverse(str));		
	}
	public static String reverse(String in)
	{
		StringBuilder out=new StringBuilder();
		char[] chars=in.toCharArray();	
		for(int i=chars.length-1;i>=0;i--)
		{
			out.append(chars[i]);
		}
		return out.toString();
	}

}

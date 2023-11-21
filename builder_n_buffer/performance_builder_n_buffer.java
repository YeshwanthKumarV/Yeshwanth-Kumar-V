package builder_n_buffer;

public class performance_builder_n_buffer
{
	

		public static void main(String[] args) {
			
			long start_time=System.currentTimeMillis();
			
			StringBuffer sb=new StringBuffer("Hello ");
			for (int i = 0; i < 10000; i++) {
				sb.append("world");
			}
			System.out.println("Time taken by StringBuffer="+(System.currentTimeMillis()-start_time)+"ms");
		
			long start_time1=System.currentTimeMillis();
			StringBuilder sb1=new StringBuilder("Hello ");
			for (int i = 0; i < 10000; i++) {
				sb1.append("world");
			}
			System.out.println("Time taken by StringBuilder="+(System.currentTimeMillis()-start_time1)+"ms");
		}
	

}

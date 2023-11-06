package absraction;

public class Honda extends Bike {

	@Override
	void run() {
		System.out.println("Running.....");
	}
	public static void main(String[] args) {
		//object
		//loose coupling 
		Honda b1=new Honda();
		b1.run();
		b1.speed();
	}

}
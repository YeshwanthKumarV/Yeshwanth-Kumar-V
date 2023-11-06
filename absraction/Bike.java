package absraction;

abstract public class Bike {
	
	//constr
	Bike(){
		System.out.println("inside constructor...");
	}
	//abstract and non-abstrct
	//abstract method
	abstract void run();
	
	//non -abstract method
	public void speed() {
		System.out.println("Maximum speed is 120");
	}
}

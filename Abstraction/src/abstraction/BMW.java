package abstraction;

import fullabstraction.Car;

public abstract class BMW {
	
	void commonFunctionality() {
		System.out.println("Inside common functionality method");
	}
	
	abstract void accelarate();
	
	public static void main(String[] args) {
		System.out.println("Inside main of abstract class");
	}
	

}

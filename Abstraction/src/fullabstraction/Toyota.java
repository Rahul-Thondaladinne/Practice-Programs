package fullabstraction;

public class Toyota implements Car{
	
	@Override
	public void go() {
		System.out.println("Inside Toyata go");
	}
	
	@Override
	public void stop() {
		System.out.println("Inside Toyota stop");
	}

}

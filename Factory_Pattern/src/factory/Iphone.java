package factory;

public class Iphone implements Mobile {
	int price=100000;
	@Override
	public void display() {
		System.out.println("Price of Iphone is:"+price);
		
	}

}

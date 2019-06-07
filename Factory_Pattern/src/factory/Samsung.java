package factory;

public class Samsung implements Mobile{
	int price=80000;
	@Override
	public void display() {
		
		System.out.println("Price of Samsung is:"+price);
	}

}

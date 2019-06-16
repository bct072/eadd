package main;

public class Factoryprovider {
	

	public static  AbstractFactory getFactory(String choice) {
		if(choice.equalsIgnoreCase("Animal"))
		{
			System.out.println("animal obj created");
			return new AnimalFactory();
			
		}
		else if(choice.equalsIgnoreCase("Color"))
		{
			System.out.println("color object created");
			return new ColorFactory();
			 
		}
		return null;
		
	}
}

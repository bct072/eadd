package main;

import factorypattern2.Bear;
import factorypattern2.Color;
import factorypattern2.Dog;
import factorypattern2.Duck;

public class ColorFactory extends AbstractFactory<Color> {

	


	@Override 
	Color create(String colortype) {
		if(colortype.equalsIgnoreCase("duck"))
		{
			return new Duck();
		}
		else if(colortype.equalsIgnoreCase("dog"))
		{
			return new Dog();
		}
		else if(colortype.equalsIgnoreCase("bear"))
		{
			return new Bear();
		}
		return null;
	}

}

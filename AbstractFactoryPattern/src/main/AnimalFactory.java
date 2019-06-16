package main;

import factorypattern1.Animal;
import factorypattern1.Dog;
import factorypattern1.Duck;
import factorypattern1.Bear;

public class AnimalFactory extends AbstractFactory<Animal>{

	@Override
	Animal create(String animaltype) {
		if("Dog".equalsIgnoreCase(animaltype)) {
			System.out.println("dog obj created");
			return new Dog();
			
		}
		else if(animaltype.equalsIgnoreCase("Duck"))
		{
			System.out.println("Duck object Created");
		return new Duck();	
		}
		else if(animaltype.equalsIgnoreCase("Bear"))
		{
			System.out.println("Bear object created");
			return new Bear();
		}
		else
		
		return null;
	}

	
	

}

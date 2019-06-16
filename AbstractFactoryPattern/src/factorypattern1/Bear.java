package factorypattern1;

public class Bear implements Animal{

	@Override
	public void getAnimal() {
		
		System.out.println("Name: Bear");
	}

	@Override
	public void makeSound() {
		
		System.out.println("Sound: Groals");
	}

}

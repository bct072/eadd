package factorypattern1;

public class Dog implements Animal{

	@Override
	public void getAnimal() {
		
		System.out.println("Name: Dog");
	}

	@Override
	public void makeSound() {
		
		System.out.println("Sound: Bow Bow");
	}

}

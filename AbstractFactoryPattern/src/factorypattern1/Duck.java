package factorypattern1;

public class Duck implements Animal{

	@Override
	public void getAnimal() {
		
		System.out.println("Name: Duck");
	}

	@Override
	public void makeSound() {
		
		System.out.println("Sound: Quake");
	}

}

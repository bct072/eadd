package main;

import java.util.Scanner;

import factorypattern1.*;
import factorypattern2.*;

public class Main {

	public static void main(String[] args) {
		
		String choice;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a choice to get object:");
		System.out.println("Enter: animal or color");
		choice=sc.nextLine();
		if(choice.equalsIgnoreCase("animal"))
		{
			AbstractFactory<Animal> af=Factoryprovider.getFactory(choice);
			System.out.println("enter the animal name:");
			String name=sc.nextLine();
			Animal animal=af.create(name);
			animal.getAnimal();
			animal.makeSound();
			
		}
		if(choice.equalsIgnoreCase("color"))
		{
			AbstractFactory<Color> af=Factoryprovider.getFactory(choice);
			System.out.println("enter the animal name:");
			String name=sc.nextLine();
			Color color=af.create(name);
			color.getcolor();
			
			
		}
		
		
		
		
		sc.close();
		
	}
}

package factory;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Control ctrl=new Control();
	String str;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name of object to be created:");
	System.out.println("enter sony or iphone or samsung or blackberry::\n");
	str=sc.nextLine();
	Mobile mobile =ctrl.choice(str);
	mobile.display();
	sc.close();
	
}
}

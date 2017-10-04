//added to git

import java.util.Scanner;

public class AboutMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner (System.in);
		String name;
		String color;
		
		System.out.println("What is your name?");
		name = reader.nextLine();
		
		System.out.println("What is your favorite color?");
		color = reader.nextLine();
		
		reader.close();
		
		System.out.println("Hi " + name + ", " + color + " is a great color!" );
		
	}

}

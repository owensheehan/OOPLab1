package Part2;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Car {
	Scanner scan = new Scanner(System.in);

	int age;
	public String entry() {
		String carDescription;
		System.out.println("Enter the make of the car:");
		String make = scan.next();
		System.out.println("Enter the model of the car:");
		String model = scan.next();
		
		getAge();// calls the get age function, which was seperated from this function in order to better deal with exceptions.
		switch (age) { // creates a string for the age and condition of the car.
		case 0 : carDescription = make+" "+model+" is less than 1 year of age and is Shiny New";break;
		case 1 : carDescription = make+" "+model+" is 1 year old and is Shiny New";break;
		case 2 : case 3 : carDescription = make+" "+model+"is "+age+" years old and is Shiny New";break;
		case 4 : case 5 : carDescription = make+" "+model+"is "+age+" years old and isSlightly worn";break;
		case 6 : case 7 : carDescription = make+" "+model+"is "+age+" years old and isPast its best";break;
		case 8 : case 9 : carDescription = make+" "+model+"is "+age+" years old and isShowing signs of age";break;
		case 10 : default : carDescription = make+" "+model+"is "+age+" years old and is a Banger";break;
		}
		return carDescription;
	}
	
	public void getAge() {
		boolean test = false;
		while (test == false) {
			try {
				System.out.println("Enter the age of the car:");
				age = scan.nextInt();
				test = true;
			}
			catch (InputMismatchException e){// catches wrong input types.
				System.out.println("Error! Please use only numbers for the age of the car!");
				scan.next();
				continue;
			}
		}
	}
}

package Part2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu{
	int selection;
	private Scanner scan;
	public void firstMenu() {
		
		System.out.println("Welcome to TestCarPartA.\nPlease select:");
		System.out.println("1     Begin Entering Cars.");
		System.out.println("0     Exit");
		selection();
		switch (selection) {
		case 1 : System.out.println("Please begin.");break;
		case 0 : System.out.println("Goodbye");
				 System.exit(0);
		}
		TestCarPartA dataEntry = new TestCarPartA();
		dataEntry.main();
	
				
	}
	
	public Boolean moreData() {
		Boolean more = true;
		System.out.println("Do you want to enter Data for another car?");
		System.out.println("1     Yes! Enter more cars.");
		System.out.println("0     No! Exit data entry");
		selection();
		switch (selection) {
		case 1 : more = true;
				 break;
		case 0 : System.out.println("These are the cars you have entered"); 
				 more = false;
				 break;
				 
		}
		return more;		 
		
	}

	public void selection() {
		scan = new Scanner(System.in);
		boolean test = false;
		while (test == false) {
			try {
				selection = scan.nextInt();
				test = true;
			}
			catch (InputMismatchException e) {// Catches input mismatch exceptions, and gives the user another go
				System.out.println("Error! Please use only numbers for your selection!");
				scan.next();
				continue;
			}
			
			}
	}

}

package Part2;

import java.util.ArrayList;

public class TestCarPartA {
	Menu next = new Menu();
	ArrayList<String> cars = new ArrayList<String>();// creates new array object to store the car data
	
	public void main() {
		
		Boolean more = true;
		while (more == true){// A loop to enter multiple cars.
			Car car1 = new Car();
			cars.add(car1.entry());
			more = next.moreData();
			
			}
		list();
		}
	public void list() {
		for(String c: cars) { // Prints the contents of the arraylist
			System.out.println(c);
		}
	}
	
}

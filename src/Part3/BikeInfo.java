package Part3;

import java.util.Random;

public class BikeInfo  {
	public BikeInfo() {

	}

	String[] makeOfBike= {"Raleigh","Enigma Titanium","Falcon","Dynacraft","Excelsior",""};//Creates the array for the make of bike
	String[] typeOfBike = {"BMX","Road bike","Mountain Bike","Electric bike"};// and also the type of bike. I used an array instead of arraylist because the contents wont change.
	Random R = new Random();// New instance of random.
	
	
	public String make(){
		String make = makeOfBike[R.nextInt(makeOfBike.length-1)]; // selects a random index of the array. -1 to cater for index 0.
		return make;
	}
	public String type() {
		String type = typeOfBike[R.nextInt(typeOfBike.length-1)];
		return type;
	}
	public int speed() {
		int speed = R.nextInt(200);
		return speed;
	}

}

package Part3;

public class Bicycle {
	String maker;	
	String type;
	BikeInfo info = new BikeInfo(); // creates a new instance of BikeInfo. 
	int speed;
	
	public void setSpeed() {
		this.speed = info.speed(); // Calls function speed form object info.
	}
	public Bicycle(int speed ,String maker ,String type) {//Constructor
	}	
	public int getSpeed() {//returns the value of speed.
		return speed;
	}

	public void go(int speed) {
		setSpeed(); // Calls function setSpeed() which sets the value of speed.
		int bikeSpeed = getSpeed();// Gets the value of speed through getSpeed();
		System.out.println("I am going at "+bikeSpeed+" pedals per minute");
	}
	public void go() {
		System.out.println("I am going as fast as I can");
	}
	public String toString() {
		return "Bicycle [speed=" + speed + ", maker=" + info.make() + ", type=" + info.type() + "]";
	}
	
	public void print() {
		System.out.println(toString());
	}


}

	
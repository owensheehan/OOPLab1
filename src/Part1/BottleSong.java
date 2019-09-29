package Part1;

public class BottleSong {
	private String message;
	private int bottles;
	//Constructor same name as class
	public BottleSong(int bottles) {
		this.bottles = bottles;
	}
	public void startSong() {
		while(this.bottles > -1)
		{
			Message();
		}
	} 
	
	public void Message() {
		switch(this.bottles) {
		case 1: this.message = playSingleBottle();
				break;
		case 0: this.message = playNoBottles();
				break;
		default: this.message = playAllBottles();
		}
		System.out.println(this.message);
		this.bottles--;
		
		}
	public String playSingleBottle() {
		return(bottles+" of beer on the wall,\n"+bottles+" bottle of beer, \n take it down, \n pass it around \n");

	}
	
	public String playNoBottles() {
		return("No more Bottles of beer on the wall");
		
	}
	
	public String playAllBottles() {
		return(bottles+" Bottles of beer on the wall,\n"+bottles+" bottles of beer, \n take one down, \n pass it around \n");
		
	}
}
	
	

package Part3;

public class Main {

	public static void main(String[] args) {
		Bicycle b = new Bicycle(0, null, null);
		b.go();//calls the fist go function
		b.go(0);// calls the second go function and passes an in
		b.print();// Calls the print function

	}

}

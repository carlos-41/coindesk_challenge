package coindesk_challenge;

public class Mustang extends Vehicle {
	
	private boolean isConvertible;

	public Mustang(int wheels, String color, String make, String model, int year, boolean isConvertible) {
		super(wheels, color, make, model, year);
		this.isConvertible = isConvertible;
	}
	
	public void openTop() {
		if(this.isConvertible) {
//			Open top method implementation
		}
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
	}

	@Override
	public void steer() {
		// TODO Auto-generated method stub	
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub	
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub	
	}

	@Override
	public void refuel() {
		// TODO Auto-generated method stub	
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub	
	}
	
}

package coindesk_challenge;

public class Prius extends Vehicle {
	private boolean hasBatteries;
	
	public Prius(int wheels, String color, String make, String model, int year) {
		super(wheels, color, make, model, year);
		hasBatteries = true;
	}
	
	public boolean HasBatteries() {
		return hasBatteries;
	}

	public void setHasBatteries(boolean hasBatteries) {
		this.hasBatteries = hasBatteries;
	}

	private void recharge() {
//		Recharge method implementation
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
		recharge();	
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub	
	}

}

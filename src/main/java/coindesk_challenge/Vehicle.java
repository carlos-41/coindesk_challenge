package coindesk_challenge;

public abstract class Vehicle {
	private int wheels;
	private String color;
	private String make;
	private String model;
	private int year;
	
	public abstract void start();
	public abstract void steer();
	public abstract void accelerate();
	public abstract void brake();
	public abstract void refuel();
	public abstract void turnOff();

	public Vehicle(int wheels, String color, String make, String model, int year) {
		super();
		this.wheels = wheels;
		this.color = color;
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}

package edu.westga.cs3211.vcs_activity.model;

/**
 * A car
 * 
 * @author John Chittam, Michael Pavich, Thomas Morgenstern
 */
public class Car {

	private int speed;
	private String color;
	
	/**
	 * Instantiates a new car.
	 * 
	 * @precondition speed >= 0 && color != null && !color.isEmpty()
	 * @postcondition getSpeed() == speed && getColor() == color
	 *
	 * @param speed the speed
	 * @param color the color
	 */
	public Car(int speed, String color) {
		if (speed < 0) {
			throw new IllegalArgumentException("Speed must be greater than or equal to 0.");
		}
		if (color == null) {
			throw new IllegalArgumentException("Color can not be null.");
		}
		if (color.isEmpty()) {
			throw new IllegalArgumentException("Color can not be empty.");
		}
		
		this.speed = speed;
		this.color = color;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public String getColor() {
		return this.color;
	}
	
	@Override
	public boolean equals(Object car) {
		if (((Car)car).getSpeed() == this.getSpeed() && ((Car)car).getColor().equals(this.getColor())) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "A " + this.color + " car that goes " + this.speed + " mph."; 
	}
}

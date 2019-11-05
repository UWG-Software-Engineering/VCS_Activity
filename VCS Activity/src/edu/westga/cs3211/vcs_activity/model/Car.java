package edu.westga.cs3211.vcs_activity.model;

/**
 * A car
 * 
 * @author John Chittam
 *
 */
public class Car {
	
	private int speed;
	private String color;
	
	public int getSpeed() {
		return this.speed;
	}
	
	public String getColor() {
		return this.color;
	}
	
	@Override
	public String toString() {
		return "A " + this.color + " car that goes " + this.speed + " mph."; 
	}

}

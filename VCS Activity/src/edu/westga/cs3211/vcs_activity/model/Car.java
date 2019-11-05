package edu.westga.cs3211.vcs_activity.model;

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
	public boolean equals(Object car) {
		if (((Car) car).getColor().equals(this.color) && ((Car) car).getSpeed() == this.speed) {
			return true;
		} else {
			return false;
		}
	}
	
}

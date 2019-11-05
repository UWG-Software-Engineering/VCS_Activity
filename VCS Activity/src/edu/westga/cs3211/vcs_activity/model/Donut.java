package edu.westga.cs3211.vcs_activity.model;
/**
 * 
 * @author Andrew Stoddard, Kenneth Wilson, Aaron Merrell
 *
 */
public class Donut {
	private int calories;
	private boolean sprinkles;
	
	
	/**
	 * creates a Donut Object
	 * @preconditions calories > 0 |
	 * @param calories , calories of donut
	 * @param sprinkles , if donut has sprinkles
	 * 
	 */
	
	
	public Donut(int calories, boolean sprinkles) {
		if(calories < 0) {
			throw new IllegalArgumentException("Can't be less than 0");
		}
		this.calories = calories;
		this.sprinkles = sprinkles;
	}
	
	
	/**
	 * gets the calories
	 * @return the low number of calories
	 */
	public int getCalories() {
		return calories;
	}
	/**
	 * sets the calories
	 * 
	 * @param calories
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}
	/**
	 * gets sprinkles
	 * @return true if there are sprinkles | false if no sprinkles :(
	 */
	public boolean isSprinkles() {
		return sprinkles;
	}
	/**
	 * sets sprinkles
	 * @param sprinkles
	 */
	public void setSprinkles(boolean sprinkles) {
		this.sprinkles = sprinkles;
	}
	
	/**
	 * Compares two donuts, returns True if they are equivalent.
	 * 
	 * @param otherDonut
	 * @return
	 */
	public boolean equals(Donut otherDonut) {
		if (otherDonut == null) {
			throw new IllegalArgumentException("otherDonut cannot be null");
		}
		return this.calories == otherDonut.getCalories() && this.sprinkles == otherDonut.sprinkles;
	}
}

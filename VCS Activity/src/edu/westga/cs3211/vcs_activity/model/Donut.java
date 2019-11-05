package edu.westga.cs3211.vcs_activity.model;
/**
 * 
 * @author Member 1: Andrew Stoddard, 
 *		   Member 2: Kenneth Wilson, 
 *		   Member 3: Aaron Merrell
 *
 */
public class Donut {
	private int calories;
	private boolean sprinkles;
	
	
	/**
	 * creates a Donut Object
	 * @preconditions calories > 0 
	 * @postconditions getCalorie
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
	 * gets sprinkles
	 * @return true if there are sprinkles | false if no sprinkles :(
	 */
	public boolean isSprinkles() {
		return sprinkles;
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
	
	@Override
	public String toString() {
		if (this.sprinkles) {
			return "Donut has sprinkles and is " + this.calories + " claories";
		} else {
			return "Donut has no sprinkles and is " + this.calories + " claories";
		}
	}
}

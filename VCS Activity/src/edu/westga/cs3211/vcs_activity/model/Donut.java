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
	
}

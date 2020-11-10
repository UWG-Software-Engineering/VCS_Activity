package model;

/**
 * The Class Boat
 * 
 * @author Daniel Crumpler and Rasheed Jones
 * @version Fall 2020
 *
 */
public class Boat {

	private String brand;
	private int length;
	
	/**
	 * Instantiates a new Boat
	 * 
	 * @param brand the brand of the boat.
	 * @param length the length of a boat.
	 */
	public Boat (String brand, int length) {
		this.brand = brand;
		this.length = length;
	}
	
	public boolean equals(Boat otherBoat) {
		return (this.brand == otherBoat.brand && this.length == otherBoat.length);
	}
	
	@Override
	public String toString() {
		return "This boat is a " + this.brand + " with a length of " + this.length + " feet."
	}
}

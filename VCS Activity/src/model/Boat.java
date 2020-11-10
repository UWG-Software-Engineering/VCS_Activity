package model;

public class Boat {

	private String brand;
	private int length;
	
	public Boat (String brand, int length) {
		this.brand = brand;
		this.length = length;
	}
	
	public boolean equals(Boat otherBoat) {
		
		return (this.brand == otherBoat.brand && this.length == otherBoat.length);
		
	}
}

package model;

public class Car {
	
	private String make;
	private String model;
	
	/**
	 * The constructor for the car class
	 * 
	 * @precondition make.isEmpty() == False && make != null && model.isEmpty() == False && model != null
	 * @postcondition this.make == make && this.model == model
	 * 
	 * @param make the make of the car
	 * @param model the model of the car
	 */
	
	public Car(String make, String model) {
		
		if (make.isEmpty()) {
			throw new IllegalArgumentException("Car make cannot be empty");
		} 
		if (make == null) {
			throw new IllegalArgumentException("Car make cannot be null");
		}
		if (model.isEmpty()) {
			throw new IllegalArgumentException("Car model cannot be empty");
		}
		if (make == null) {
			throw new IllegalArgumentException("Car model cannot be null");
		}
		
	}

}

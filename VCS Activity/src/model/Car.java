<<<<<<< HEAD
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
	
	/**
	 * The getter for the car make
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return the car make
	 */
	
	public String getMake() {
		return this.make;
	}
	
	/**
	 * The getter for the car model
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return the car model
	 */
	
	public String getModel() {
		return this.model;
	}
=======

public class Car {
>>>>>>> branch 'master' of https://github.com/UWG-Software-Engineering/VCS_Activity.git

}

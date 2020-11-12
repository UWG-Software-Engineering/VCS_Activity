/**
 * Represents the School class
 * @author JinxiangZen, Kenneth Mitchell
 *
 */
public class School {
	 
	private String name;
	private String location;
	
	/**
	 * Initial new school
	 * precondition name != null && location != null
	 * postcondition this.name ==  name && this loction == location
	 * @param name The name of the school
	 * @param location The location of the School
	 */
	public School(String name, String location) {
		if(name == null) {
			throw new IllegalArgumentException("Name cannot be null.");
		}
		if(location == null) {
			throw new IllegalArgumentException("location cannot be null.");
		}
		this.name = name;
		this.location = location;
	}
	
	/**
	 * Get the shcool name
	 */
	public void getName() {
		return this.name;

	}
	
	/**
	 * Get the location
	 */
	public void getLocation() {
		return this.location;
	}
	

}

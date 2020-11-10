package model;
/**
 * The student Class
 * @author jechols5
 *
 */
public class Student {
	private String name;
	private double GPA;
	
	/**
	 * Gets the name of the student 
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return the name of the student
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * Gets the GPA of the student
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return the GPA of the student
	 */
	public double getGPA() {
		return this.GPA;
	}
	
	/**
	 * The string representation of a student
	 */
	public String toString() {
		return this.name + " has a GPA of " + this.GPA;
	}
}

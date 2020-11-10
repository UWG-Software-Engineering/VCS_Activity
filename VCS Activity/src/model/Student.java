package model;
<<<<<<< HEAD

/**
 * The student Class
 * @author jechols5
 *
 */
public class Student {
	private String name;
	private double gpa;
	
	public Student(String name, Double gpa) {
		if(name == null) {
			throw new IllegalArgumentException("Name cannot be null.");
		}
		if(name.isBlank() || name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be blank or empty.");
		}
		if(gpa < 0) {
			throw new IllegalArgumentException("GPA cannot be negative");
		}
		this.name = name;
		this.gpa = gpa;
	}
	
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
		return this.gpa;
	}
	
	/**
	 * The string representation of a student
	 */
	public String toString() {
		return this.name + " has a GPA of " + this.gpa;
	}
>>>>>>> branch 'master' of https://github.com/UWG-Software-Engineering/VCS_Activity.git
}

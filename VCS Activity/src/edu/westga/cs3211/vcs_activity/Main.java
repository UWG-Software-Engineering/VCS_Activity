package edu.westga.cs3211.vcs_activity;


import edu.westga.cs3211.vcs_activity.model.Student;

/** 
 * @author Jonathan Corley, Andrew Stoddard, Andrew Steinborn, Thomas Whaley

 * @version Fall 2019
 */
public class Main {
	
	/** Entry point for the program.
	 * 
	 * @param args command line arguments (we won't need this!)
	 */
	public static void main(String[] args) {
		System.out.println("Jonathan Corley added this!");
		
		// Andrew Steinborn start
		Student student = new Student("Ant-Man", 98);
		
		// Thomas Whaley start
		Student otherStudent = new Student("Ant-Man", 98);
		System.out.println("The two students are equal: " + student.equals(otherStudent));

		// Thomas Whaley end
	}

}

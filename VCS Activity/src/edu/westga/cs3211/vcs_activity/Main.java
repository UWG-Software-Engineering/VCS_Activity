package edu.westga.cs3211.vcs_activity;

import edu.westga.cs3211.vcs_activity.model.Book;
import edu.westga.cs3211.vcs_activity.model.Car;
import edu.westga.cs3211.vcs_activity.model.Donut;
import edu.westga.cs3211.vcs_activity.model.Ice_Cream;
import edu.westga.cs3211.vcs_activity.model.Student;

/**
 * @author Jonathan Corley, Andrew Stoddard, Andrew Steinborn, Thomas Whaley,
 *         Jake Pefinis, Josh Pefinis, Timothy Brooks, Thomas Morgenstern
 * 
 * @version Fall 2019
 */
public class Main {

	/**
	 * Entry point for the program.
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
		System.out.println(student);

		// Darrius Dupree Start
		Ice_Cream iceCream = new Ice_Cream("Chocolate", true);
		Ice_Cream iceCream2 = new Ice_Cream("Chocolate", true);
		System.out.println("The stuff is not equal " + iceCream2.equals(iceCream));

		// Jake Pefinis start
		Book book = new Book("Title", 100);

		// Josh Pefinis start
		Book book2 = new Book("Other Title", 100);
		System.out.println("These books are not equal" + book.equals(book2));
		
		// Andrew Young toString()
		Ice_Cream ice_cream = new Ice_Cream("chocolate", true);
		System.out.println(ice_cream);

		/**
		 * Andrew Stoddard Start
		 */
		Donut donut = new Donut(20, true);
		/**
		 * Andrew Stoddard End
		 */
		
		//Thomas Morgenstern start
		Car car = new Car(30, "red");
		//Thomas Morgenstern end
		
		//Michael Pavich equals()
		Car otherCar = new Car(30, "red");
		System.out.println("The two cars are equal: " + car.equals(otherCar));
	}

}

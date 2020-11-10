/** The entry point for the program
 * 
 * @author Jared Golden
 * @version Fall 2020
 */
public class Dog {

	private String name;
	private int age;
	
	public Dog(String name, int age) {
		if(age < 1) {
			throw new IllegalArgumentException("Age cannot be null.");
		}
		if(name.isBlank() || name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be blank or empty.");
		}
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "Name: " + this.name + ", Age: " + this.age;
	}

}

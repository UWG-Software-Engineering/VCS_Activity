/** The entry point for the program
 * 
 * @author Jonathan Corley
 * @version Fall 2020
 */
public class Main {

	/** Entry point for the program
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @param args we are not using these.
	 */
	public static void main(String[] args) {
		Book book = new Book("The Title","The Author");
		Desk desk = new Desk("Oak", 2);
		School school = new School("UWG", "Location");
	}

}

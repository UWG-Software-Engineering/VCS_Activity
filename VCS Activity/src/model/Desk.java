/**
 * Defines a desk object
 * @author Austin Snyder,
 * @author David Walker,
 *
 */
public class Desk {

	private String woodType;
	private int numberOfDrawers;
	
	/**
	 * Creates a desk object
	 * @param woodType - the type of wood used to build the desk
	 * @param numberOfDrawers - the number of drawers in the desk
	 * @precondition - woodType != null
	 * 				   numberOfDrawers > 0
	 * @postcondition - new Desk object is created
	 * @return none
	 */
	public Desk(String woodType, int numberOfDrawers) {
		if (woodType == null) {
			throw new IllegalArgumentException("Wood type must not be null");
		}
		if (numberOfDrawers < 0) {
			throw new IllegalArgumentException("Number of drawers must be greater than or equal to 0");
		}
		this.woodType = woodType;
		this.numberOfDrawers = numberOfDrawers;
	}
	
	@Override
	public String toString() {
		return "Wood Type: " + this.woodType + " with " + this.numberOfDrawers + " drawers";
	}
}

/**
 * Defines a desk object
 * @author Austin Snyder,
 * @author David Walker,
 *
 */
public class Desk {

	private string woodType;
	private int numberOfDrawers;
	
	public Desk(String woodType, int numberOfDrawers) {
		if (woodType.equals(null)) {
			throw new IllegalArgumentException("Wood type musrt bot be null");
		}
		if (numberOfDrawers <= 0) {
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

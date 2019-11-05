package nicJeremyMike;

public class Mammoth {

	private int numTusks;
	private boolean frozen;
	
	public Mammoth(int tusks, boolean frozen) {
		if(tusks < 0 || tusks > 100) {
			throw new IllegalArgumentException("Must have between 0 and 100 tusks.");
		}
		this.numTusks = tusks;
		this.frozen = frozen;
	}
	
	public int getTusks() {
		return this.numTusks;
	}
	
	public boolean getFrozen() {
		return this.frozen;
	}
}

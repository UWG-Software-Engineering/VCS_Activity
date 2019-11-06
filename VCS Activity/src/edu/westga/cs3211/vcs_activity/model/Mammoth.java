package edu.westga.cs3211.vcs_activity.model;

/**
 * Class for creating Mammoths 
 * @author Nicolas Sacandy, Jeremy Trimble, Stanley Jiles 
 */

public class Mammoth {

	private int numTusks;
	private boolean frozen;
	
	/**
	 *  Creates a new mammoth object
	 *  @author NS
	 *  @param tusks int number of tusks the mammoth can have (these can be very tusky creatures)
	 *  @oaram frozen boolean value indicating if the mammoth is currently frozen
	 *  @precondition tusks !< 0 && tusks !> 100
	 *  @postcondition this.tusks == tusks, this.frozen == frozen
	 */
	
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
	
	@Override
	public String toString(){
		return "Number of tusk: " + this.numTusks + " and is Frozen " + this.frozen;
	}


}
package edu.westga.cs3211.vcs_activity.model;




public class Ice_Cream {

	/** The flavor. */
	public String flavor;
	
	/** The has nuts. */
	public boolean hasNuts;
	
	/**
	 * Instantiates a new ice cream.
	 *
	 * @param flavor the flavor
	 * @param hasNuts the has nuts
	 * 
	 * @Precondition Icecream has to be a string and nuts is a boolean
	 */
	public Ice_Cream(String flavor, boolean hasNuts) {
		
		if(flavor == null) {
			throw new IllegalArgumentException("Flavor can't be null");
		}

		this.flavor = flavor;
		this.hasNuts = hasNuts;
	}

	/**
	 * Gets the flavor.
	 *
	 * @return the flavor
	 */
	public String getFlavor() {
		return flavor;
	}

	/**
	 * Checks if it has nuts.
	 *
	 * @return true, if is checks for nuts
	 */
	public boolean isHasNuts() {
		return hasNuts;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		String ice_cream = this.flavor + " ice cream ";
		
		if (hasNuts) {
			ice_cream += "with nuts!";
		}
		
		return ice_cream;
	}
}

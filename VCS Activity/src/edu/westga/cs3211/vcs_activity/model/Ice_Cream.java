package edu.westga.cs3211.vcs_activity.model;

public class Ice_Cream {

	public String flavor;
	public boolean hasNuts;
	
	public Ice_Cream(String flavor, boolean hasNuts) {

		this.flavor = flavor;
		this.hasNuts = hasNuts;
	}

	public String getFlavor() {
		return flavor;
	}

	public boolean isHasNuts() {
		return hasNuts;
	}
	
	public String toString() {
		String ice_cream = this.flavor + " ice cream ";
		
		if (hasNuts) {
			ice_cream += "with nuts!";
		}
		
		return ice_cream;
	}
}

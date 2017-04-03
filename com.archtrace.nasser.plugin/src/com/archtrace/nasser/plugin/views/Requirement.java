package com.archtrace.nasser.plugin.views;

public class Requirement {
	
	public String URID;
	public String Feature;
	public String Description;
	/**
	 * @return the uRID
	 */
	public String getURID() {
		return URID;
	}
	/**
	 * @param uRID the uRID to set
	 */
	public void setURID(String uRID) {
		URID = uRID;
	}
	/**
	 * @return the feature
	 */
	public String getFeature() {
		return Feature;
	}
	/**
	 * @param feature the feature to set
	 */
	public void setFeature(String feature) {
		Feature = feature;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return Description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		Description = description;
	}
	
	@Override
	public String toString(){
final StringBuilder formatted = new StringBuilder();
		
		if (URID == null){
			formatted.append(" No id ");
		}
		else{
			formatted.append(" [").append(URID).append("] ");
		}
		if (Feature==null){
			formatted.append(" [No Feature] ");
		} else {
			formatted.append(" ("+Feature+ ")  ");
		}
		if (Description==null){
			formatted.append(" [NO Description] ");
		} else {
			formatted.append(Description);
		}
		
	
		return formatted.toString();
		
	}
	

}

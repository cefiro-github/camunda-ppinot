package es.us.eii.gps.ppi.model;

import java.io.Serializable;

public class SimplePPI implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String 	name;
	private String 	target;
	private String 	description;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public SimplePPI(String name, String target, String description) {
		super();
		this.name 			= name;
		this.target 		= target;
		this.description 	= description;
	}
	
	public SimplePPI() {
		super();
		this.name 			= "";
		this.target			= "";
		this.description	= "";
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}

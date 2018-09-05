package co.grandcircus.APICapstone.entity;

//import javax.persistence.Entity;

//@Entity
public class State {
	
	private String name;
	private String stateCode;
	
	public State() {}
	
	public State(String name, String stateCode) {
		super();
		this.name = name;
		this.stateCode = stateCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	@Override
	public String toString() {
		return   stateCode ;
	}
	
	

}

package co.grandcircus.APICapstone.entity;

public class Classification {
	
	private Boolean family;

	public Boolean getFamily() {
		return family;
	}

	public void setFamily(Boolean family) {
		this.family = family;
	}

	@Override
	public String toString() {
		if(family == false)
			return  "No";
		else
			return "Yes";
	}
	
	

}

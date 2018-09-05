package co.grandcircus.APICapstone.entity;

//@Entity
//@Table (name = "event")
public class City {
	
//	@Column(name = "city_name")
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "City [name=" + name + "]";
	}
	
	

}

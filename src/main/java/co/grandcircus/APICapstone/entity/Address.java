package co.grandcircus.APICapstone.entity;

//@Entity
//@Table(name = "event")
public class Address {
//	@Column(name="line1")
	private String line1;
	
	public Address() {}
	
	public Address(String line1) {
		super();
		this.line1 = line1;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 + "]";
	}
	
	

}

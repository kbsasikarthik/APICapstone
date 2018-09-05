package co.grandcircus.APICapstone.entity;

//@Entity
//@Table(name="event")
public class Venue {
	
//	@Column(name="event_name")
	private String name;
//	@Column(name="city")
	private City city;
//	@Column(name="state")
	private State state;
	private Address address;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Venue [name=" + name + ", city=" + city + ", state=" + state + ", address=" + address + "]";
	}
	
	
	
	
	
}

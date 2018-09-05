package co.grandcircus.APICapstone.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

//@Entity
public class Event {
//	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//	@Column(name="event_name")
	private String name;
	
	private Dates dates;
	private List<Classification> classifications;
	private List<Outlet> outlets;
	@JsonProperty("_embedded")
	public Embedded2 embedded;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Dates getDates() {
		return dates;
	}
	public void setDates(Dates dates) {
		this.dates = dates;
	}
	public List<Classification> getClassifications() {
		return classifications;
	}
	public void setClassifications(List<Classification> classifications) {
		this.classifications = classifications;
	}
	public List<Outlet> getOutlets() {
		return outlets;
	}
	public void setOutlets(List<Outlet> outlets) {
		this.outlets = outlets;
	}
	public Embedded2 getEmbedded() {
		return embedded;
	}
	public void setEmbedded(Embedded2 embedded) {
		this.embedded = embedded;
	}
	@Override
	public String toString() {
		return "Event [name=" + name + ", dates=" + dates + ", classifications=" + classifications + ", outlets="
				+ outlets + ", embedded=" + embedded + "]";
	}
	
	
	
	

}

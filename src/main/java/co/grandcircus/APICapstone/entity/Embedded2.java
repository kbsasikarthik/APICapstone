package co.grandcircus.APICapstone.entity;

import java.util.List;

//@Entity
public class Embedded2 {
	
	private List<Venue> venues;

	public List<Venue> getVenues() {
		return venues;
	}

	public void setVenues(List<Venue> venues) {
		this.venues = venues;
	}

	@Override
	public String toString() {
		return "Embedded2 [venues=" + venues + "]";
	}
	
	

}

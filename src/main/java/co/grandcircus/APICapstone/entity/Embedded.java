package co.grandcircus.APICapstone.entity;

import java.util.List;

//import javax.persistence.Entity;

//@Entity
public class Embedded {
	
	private List<Event> events;

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	@Override
	public String toString() {
		return "Embedded [events=" + events + "]";
	}
	
	

}

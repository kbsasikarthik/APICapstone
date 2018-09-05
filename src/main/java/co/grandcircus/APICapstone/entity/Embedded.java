package co.grandcircus.APICapstone.entity;

import java.util.List;

//import javax.persistence.Entity;

//@Entity
public class Embedded {
	
//	private Event[] events;
	
	private List<Event> events;

//	public Event[] getEvents() {
//		return events;
//	}
//
//	public void setEvents(Event[] events) {
//		this.events = events;
//	}
	
	

	@Override
	public String toString() {
		return events +"";
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}
	
	

}

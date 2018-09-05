package co.grandcircus.APICapstone.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

//@Entity
public class ResultSet {
	@JsonProperty("_embedded")
	private Embedded embedded;

	public Embedded getEmbedded() {
		return embedded;
	}

	public void setEmbedded(Embedded embedded) {
		this.embedded = embedded;
	}

	@Override
	public String toString() {
		return "ResultSet [embedded=" + embedded + "]";
	}
	
	
}

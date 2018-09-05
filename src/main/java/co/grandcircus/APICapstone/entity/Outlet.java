package co.grandcircus.APICapstone.entity;

public class Outlet {
	
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		if(url.contains("ticketmaster"))
			return  "\""+url+"\"";
		else
			return "";
	}
	
	


}

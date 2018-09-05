package co.grandcircus.APICapstone;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.APICapstone.entity.ResultSet;

@Controller
public class APIController {
	
//	private static final String APIKEY = "RfNWelAIY8ugN50volCWT39YPDEuttKW";
	
	@RequestMapping("/")
	
	public ModelAndView home() {
		return new ModelAndView("home");
	}
	
	@RequestMapping("/search-result")
	
	public ModelAndView searchResult() {
//			@RequestParam("keyword") String keyword, @RequestParam("city") String city, @RequestParam("family") Boolean family) {
		
		ModelAndView mav = new ModelAndView("results");
		
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://app.ticketmaster.com/discovery/v2/events.json?apikey=RfNWelAIY8ugN50volCWT39YPDEuttKW";
		ResponseEntity<ResultSet> response = restTemplate.exchange(url,
				HttpMethod.GET, new HttpEntity<>(null),
				ResultSet.class);
		
		ResultSet result = response.getBody();
		System.out.println(result);
		
		mav.addObject("results", result.getEmbedded().getEvents());
		
		return mav;
	}
	

}

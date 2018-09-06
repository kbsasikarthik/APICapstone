package co.grandcircus.APICapstone;

import java.util.ArrayList;
//import java.awt.Event;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.APICapstone.dao.EventDao;
import co.grandcircus.APICapstone.entity.BucketList;
import co.grandcircus.APICapstone.entity.Event;
import co.grandcircus.APICapstone.entity.ResultSet;

@Controller
public class APIController {

//	private static final String APIKEY = "RfNWelAIY8ugN50volCWT39YPDEuttKW";

	@Autowired
	private EventDao eventDao;

	@RequestMapping("/")

	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("home");

		RestTemplate restTemplate = new RestTemplate();

		String url = "https://app.ticketmaster.com/discovery/v2/events.json?apikey=RfNWelAIY8ugN50volCWT39YPDEuttKW";
		ResponseEntity<ResultSet> response = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(null),
				ResultSet.class);

		ResultSet result = response.getBody();

		List<Event> events = result.getEmbedded().getEvents();
		mav.addObject("events", events);

		Set<String> cities = new TreeSet<String>();

		for (int i = 0; i < events.size(); i++) {

			cities.add(events.get(i).getEmbedded().getVenues().get(0).getCity().getName());

		}

//		using LambdaExpression		
//		System.out.println(events.stream().map(event -> event.getEmbedded().getVenues().get(0).getCity().getName()).collect(Collectors.toList()));

//		System.out.println(cities);
		mav.addObject("cities", cities);
		mav.addObject("title", "Search Events!");
		return mav;
	}

	@RequestMapping("/search-result")

	public ModelAndView searchResult(@RequestParam("keyword") String keyword, @RequestParam("city") String city,
			@RequestParam("family") Boolean family) {
		System.out.println(keyword + city + family);
		ModelAndView mav = new ModelAndView("results");

		RestTemplate restTemplate = new RestTemplate();
		String url = "https://app.ticketmaster.com/discovery/v2/events.json?apikey=RfNWelAIY8ugN50volCWT39YPDEuttKW";
		ResponseEntity<ResultSet> response = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(null),
				ResultSet.class);

		ResultSet result = response.getBody();

		List<Event> events = result.getEmbedded().getEvents();

		List<Event> filteredEvents = new ArrayList<Event>();

		for (int i = 0; i < events.size(); i++) {

			String selcity = events.get(i).getEmbedded().getVenues().get(0).getCity().getName();
			String key = events.get(i).getName().toLowerCase();
			Boolean fam = events.get(i).getClassifications().get(0).getFamily();
//			System.out.println(events.get(i));
			if (city.equals(selcity) && key.contains(keyword.toLowerCase()) && fam == family) {

				filteredEvents.add(events.get(i));

			}

		}
		mav.addObject("title", "Results!");

		mav.addObject("filteredEvents", filteredEvents);
		mav.addObject("i", filteredEvents.size());
		return mav;
	}

	@RequestMapping("/details/{id}")

	public ModelAndView details(@PathVariable("id") String id) {
		System.out.println(id);
		ModelAndView mav = new ModelAndView("details");

		RestTemplate restTemplate = new RestTemplate();
		String url = "https://app.ticketmaster.com/discovery/v2/events.json?apikey=RfNWelAIY8ugN50volCWT39YPDEuttKW";
		ResponseEntity<ResultSet> response = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(null),
				ResultSet.class);

		ResultSet result = response.getBody();

		List<Event> events = result.getEmbedded().getEvents();
		Event filteredEvent = new Event();

		for (int i = 0; i < events.size(); i++) {
			if (events.get(i).getId().equals(id)) {
				filteredEvent = events.get(i);
			}
		}
		mav.addObject("details", filteredEvent);
		System.out.println(filteredEvent);
		return mav;
	}

	@RequestMapping("/events/{id}/{name}/update")
	public ModelAndView submitUpdate(@PathVariable("id") String id, @PathVariable("name") String name) {
		System.out.println(id);
		BucketList bl = new BucketList(id, name);

		System.out.println(bl.getId() + bl.getName());

		eventDao.update(bl);

		ModelAndView mav = new ModelAndView("bucket-list");
		mav.addObject("bl", bl);
		return mav;
	}

}

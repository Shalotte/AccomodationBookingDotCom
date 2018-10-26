package accomodation.booking.com.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import accomodation.booking.com.entities.Flights;
import accomodation.booking.com.repositories.FlightRepository;

@CrossOrigin(origins= "http://localhost:4200", allowedHeaders="*")
@RestController
@RequestMapping("/api")


public class FlightController {
	
	@Autowired
	private FlightRepository flightsRepository;
	
	
	

//Getting all payments
	@GetMapping("/flights")
	public List<Flights> getAllFlights(){
		
	List<Flights> flights = new ArrayList<>();
	flightsRepository.findAll().forEach(flights::add);
	
	return flights;
		
	}
	
//Creating a payment
	
	@PostMapping("/create/flights")
	
    public Flights createPayment(@RequestBody Flights flights) {
	
	Flights _flight = flightsRepository.save(flights);
	return _flight;	
	
	}
    

}

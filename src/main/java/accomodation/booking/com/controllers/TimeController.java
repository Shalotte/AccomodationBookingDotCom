
package accomodation.booking.com.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import accomodation.booking.com.entities.TimeEntity;
import accomodation.booking.com.repositories.TimeRepository;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins= "http://localhost:4200", allowedHeaders="*")
@RestController
@RequestMapping("/api")


public class TimeController {
	
	@Autowired
	private TimeRepository  timeRepository;
	

//Getting all payments
	@GetMapping("/time")
	public List<TimeEntity> getAllTime(){
		
	List<TimeEntity> _times = new ArrayList<>();
	timeRepository.findAll().forEach(_times::add);
	
	return _times;
		
	}
	
//Creating a payment
	
	@PostMapping("/create/time")
	
    public TimeEntity createPayment(@RequestBody TimeEntity times) {
    TimeEntity _times = timeRepository.save(times);
	return _times;	
	}
    

}

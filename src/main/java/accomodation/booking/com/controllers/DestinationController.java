package accomodation.booking.com.controllers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import accomodation.booking.com.entities.DestinationEntity;
import accomodation.booking.com.entities.ListPropertyEntity;
import accomodation.booking.com.repositories.DestinationRepository;


@CrossOrigin(origins = "http://localhost:4200",allowedHeaders="*")
@RestController
@RequestMapping("/api")

public class DestinationController {
	
@Autowired
private DestinationRepository destinationRepository ;

//Creating a destination
@PostMapping("/create/destination")

public DestinationEntity postDestination(@RequestBody DestinationEntity destination){
DestinationEntity _destination = destinationRepository.save(destination);
return _destination;
}

//Update a destination
@RequestMapping(method=RequestMethod.PUT, value=("/update/destination"))

public DestinationEntity updateDestination(@RequestBody DestinationEntity destination) {
return destination = destinationRepository.save(destination);	
}

//Searching for destination
@GetMapping("/search/destination/{destination}/{guests}/{rooms}")
public List<DestinationEntity> searchDestination(@PathVariable("destination") String destination,
 @PathVariable("guests") int guests, @PathVariable("rooms") int rooms){
	  
    
List<DestinationEntity> destinations = new ArrayList<>();
destinationRepository.findAll().forEach(destinations::add);

List<DestinationEntity> _destinations = new ArrayList<>();
	
for(int i=0; i<destinations.size(); i++) {
if( destinations.get(i).getRooms()==rooms || destinations.get(i).getGuests()==guests &&
destinations.get(i).getDestination().equals(destination) ) {

	_destinations.add(destinations.get(i));
	
}
		
		
}
	
return _destinations ;
}


//Deleting a location by id

@DeleteMapping("/destination/delete/{id}")

public ResponseEntity<String> deleteDestination(@PathVariable ("id") String id){
destinationRepository.deleteById(id);
return new ResponseEntity<String>("Destination is deleted", HttpStatus.OK);
}

}

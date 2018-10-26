package accomodation.booking.com.controllers;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import accomodation.booking.com.entities.BookingEntity;
import accomodation.booking.com.entities.ListPropertyEntity;
import accomodation.booking.com.entities.UserEntity;
import accomodation.booking.com.repositories.BookingRepository;
import accomodation.booking.com.repositories.UserRepository;

@CrossOrigin(origins = "http://localhost:4200",allowedHeaders="*")
@RestController
@RequestMapping("/api")

public class BookingController {
	
       @Autowired
       private BookingRepository bookingRepository;
       @Autowired
       private UserRepository userRepository;
       
       
       /*@PostMapping("/create/booking")
       public BookingEntity createBooking(@RequestBody BookingEntity booking) {
    	   
       BookingEntity _booking = bookingRepository.save(booking);
       return _booking;
    	   
       }*/

       
     //Create new booking    
       Map<String, String> errors;

        @PostMapping("/createBooking")
        public ResponseEntity<Object> createBooking(@RequestBody @Valid BookingEntity bookingEntity, BindingResult bindingResult, @PathVariable ("id") Long id ){
       	
       	if(bindingResult.hasErrors()) {
       		
       	errors = new HashMap<>();
       	for(FieldError error:bindingResult.getFieldErrors()) {
       		
       	errors.put(error.getField(), error.getDefaultMessage());
       	}
       	
       	return new ResponseEntity<>(errors, HttpStatus.NOT_ACCEPTABLE);
       	}
       	
       	UserEntity userEntity = null;
       	userEntity= userRepository.getOne(id);
       	bookingEntity.setUser_entity(userEntity);
       	return new ResponseEntity<>(bookingRepository.save(bookingEntity),HttpStatus.OK);
        }
        
 }



package accomodation.booking.com.controllers;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;
=======
import java.util.HashMap;
import java.util.Map;
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMethod;
=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
import org.springframework.web.bind.annotation.RestController;
import accomodation.booking.com.entities.BookingEntity;
import accomodation.booking.com.entities.ListPropertyEntity;
import accomodation.booking.com.entities.UserEntity;
import accomodation.booking.com.repositories.BookingRepository;
<<<<<<< HEAD
import accomodation.booking.com.repositories.ListPropertyRepository;
=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
import accomodation.booking.com.repositories.UserRepository;

@CrossOrigin(origins = "http://localhost:4200",allowedHeaders="*")
@RestController
@RequestMapping("/api")

public class BookingController {
	
       @Autowired
       private BookingRepository bookingRepository;
       @Autowired
       private UserRepository userRepository;
<<<<<<< HEAD
       @Autowired
   	   private ListPropertyRepository listpropertyRepository;
       
       
      @GetMapping("/booking/{id}")
      public List<BookingEntity> getUser(@PathVariable ("id") Long id ) {
    	  
       	List<BookingEntity> bookingEntity = new ArrayList<>();
       	bookingRepository.findAll().forEach(bookingEntity::add);
      	
      	List<BookingEntity> _bookingEntity = new ArrayList<>();
      	
      	for(int i=0; i<bookingEntity.size();i ++) {
      	if(bookingEntity.get(i).getUser_entity().getId().equals(id)) {
      		
      		_bookingEntity.add(bookingEntity.get(i));
      	}	
      		
      	}
      	
      	return _bookingEntity; 
      }
      
    //Updating User		
      @RequestMapping(method=RequestMethod.PUT,value=("/update/booking/{id}/{id1}"))
      public BookingEntity updateBooking(@RequestBody BookingEntity bookingEntity, @PathVariable ("id") Long id,
    		  @PathVariable ("id1") String id1) {
      	
      	UserEntity userEntity= null;
      	userEntity=userRepository.getOne(id);
      	bookingEntity.setUser_entity(userEntity);
      	
    	ListPropertyEntity listPropertyEntity = null;
       	listPropertyEntity= listpropertyRepository.getOne(id1);
       	bookingEntity.setListPropertyEntity(listPropertyEntity);
      	
          return bookingRepository.save(bookingEntity);
      }
      
=======
       
       
       /*@PostMapping("/create/booking")
       public BookingEntity createBooking(@RequestBody BookingEntity booking) {
    	   
       BookingEntity _booking = bookingRepository.save(booking);
       return _booking;
    	   
       }*/

>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
       
     //Create new booking    
       Map<String, String> errors;

<<<<<<< HEAD
        @PostMapping("/createBooking/{id}/{id1}")
        public ResponseEntity<Object> createBooking(@RequestBody @Valid BookingEntity bookingEntity, BindingResult bindingResult,
        		@PathVariable ("id") Long id, @PathVariable ("id1") String id1){
=======
        @PostMapping("/createBooking")
        public ResponseEntity<Object> createBooking(@RequestBody @Valid BookingEntity bookingEntity, BindingResult bindingResult, @PathVariable ("id") Long id ){
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
       	
       	if(bindingResult.hasErrors()) {
       		
       	errors = new HashMap<>();
       	for(FieldError error:bindingResult.getFieldErrors()) {
       		
       	errors.put(error.getField(), error.getDefaultMessage());
       	}
       	
       	return new ResponseEntity<>(errors, HttpStatus.NOT_ACCEPTABLE);
       	}
       	
<<<<<<< HEAD
       	ListPropertyEntity listPropertyEntity = null;
       	listPropertyEntity= listpropertyRepository.getOne(id1);
       	bookingEntity.setListPropertyEntity(listPropertyEntity);
       	
       	UserEntity userEntity = null;
       	userEntity= userRepository.getOne(id);
       	bookingEntity.setUser_entity(userEntity);
       	
       	return new ResponseEntity<>(bookingRepository.save(bookingEntity),HttpStatus.OK);
        }
        
        
      //Delete property
        @Transactional
        @DeleteMapping("/delete/booking/{id}")
        public ResponseEntity<String> deleteBooking(@PathVariable ("id") String id){
        	bookingRepository.deleteById(id);
        	return new ResponseEntity<>("Booking has been deleted", HttpStatus.OK);
        	
        }
=======
       	UserEntity userEntity = null;
       	userEntity= userRepository.getOne(id);
       	bookingEntity.setUser_entity(userEntity);
       	return new ResponseEntity<>(bookingRepository.save(bookingEntity),HttpStatus.OK);
        }
        
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
 }



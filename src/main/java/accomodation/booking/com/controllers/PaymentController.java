package accomodation.booking.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import accomodation.booking.com.entities.BookingEntity;
import accomodation.booking.com.entities.PaymentEntity;
import accomodation.booking.com.entities.UserEntity;
import accomodation.booking.com.repositories.PaymentRepositories;
import accomodation.booking.com.repositories.UserRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

@CrossOrigin(origins= "http://localhost:4200", allowedHeaders="*")
@RestController
@RequestMapping("/api")


public class PaymentController {
	
	@Autowired
	private PaymentRepositories paymentRepository;
	@Autowired
    private UserRepository userRepository;
	

//Getting all payments
	@GetMapping("/payments")
	public List<PaymentEntity> getAllPayments(){
		
	List<PaymentEntity> payments = new ArrayList<>();
	paymentRepository.findAll().forEach(payments::add);
	
	return payments;
		
	}
	
//Creating a payment
	
	/*@PostMapping("/create/payment")
	
    public PaymentEntity createPayment(@RequestBody PaymentEntity paymnent) {
	PaymentEntity _payment = paymentRepository.save(paymnent);
	return _payment;	
	}*/
	
    //Create new booking    
    Map<String, String> errors;

     @PostMapping("/createPayment")
     public ResponseEntity<Object> createBooking(@RequestBody @Valid PaymentEntity paymentEntity, BindingResult bindingResult, @PathVariable ("id") Long id  ){
    	
    	if(bindingResult.hasErrors()) {
    		
    	errors = new HashMap<>();
    	for(FieldError error:bindingResult.getFieldErrors()) {
    		
    	errors.put(error.getField(), error.getDefaultMessage());
    	}
    	
    	return new ResponseEntity<>(errors, HttpStatus.NOT_ACCEPTABLE);
    	}
    	
    	UserEntity userEntity = null;
     	userEntity= userRepository.getOne(id);
     	paymentEntity.setUser_entity(userEntity);
    	return new ResponseEntity<>(paymentRepository.save(paymentEntity),HttpStatus.OK);
     }
    
     

}

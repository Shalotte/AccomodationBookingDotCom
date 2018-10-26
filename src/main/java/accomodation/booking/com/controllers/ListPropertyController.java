package accomodation.booking.com.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import accomodation.booking.com.entities.ListPropertyEntity;
import accomodation.booking.com.entities.UserEntity;
import accomodation.booking.com.repositories.ListPropertyRepository;
import accomodation.booking.com.repositories.UserRepository;




@CrossOrigin(origins = "http://localhost:4200",allowedHeaders="*")
@RestController
@RequestMapping("/appi")



public class ListPropertyController {
	
	@Autowired
	private ListPropertyRepository listpropertyRepository;
	@Autowired
	private UserRepository userRepository;

	
//Getting all the properties given a user id	
	//@GetMapping("/properties/{id}")
	//public List<ListPropertyEntity> getProperties(@PathVariable Long userEntityId){
			
	//List<ListPropertyEntity> properties = new ArrayList<>();
	//listpropertyRepository.findByuserEntityId(userEntityId).forEach(properties::add);
				
	//return properties;
	//}
	
	
//Getting a list of property belonging to a user
	
@GetMapping("/userProperty/{id}")
public List<ListPropertyEntity> UserProperty(@PathVariable ("id") Long id){
	
	List<ListPropertyEntity> listProperty = new ArrayList<>();
	listpropertyRepository.findAll().forEach(listProperty::add);
	
	List<ListPropertyEntity> userProperty = new ArrayList<>();
	
	for(int i=0; i<listProperty.size();i ++) {
	if(listProperty.get(i).getUserEntity().getId().equals(id)) {
		
		userProperty.add(listProperty.get(i));
	}	
		
	}
	
	return userProperty;
}

//Updating User		
@RequestMapping(method=RequestMethod.PUT,value=("/update/property/{id}"))
public ListPropertyEntity updateProperty(@RequestBody ListPropertyEntity listPropertyEntity, @PathVariable ("id") Long id) {
	
	UserEntity userEntity= null;
	userEntity=userRepository.getOne(id);
	listPropertyEntity.setUserEntity(userEntity);
    return listpropertyRepository.save(listPropertyEntity);
}
	
 
//
@PostMapping("/create/properties/{id}")
public ListPropertyEntity listProperty(@RequestBody ListPropertyEntity listproperty,@PathVariable ("id") Long id) {
	
    UserEntity userEntity= null;
    userEntity=userRepository.getOne(id);
    listproperty.setUserEntity(userEntity);
    
	return listpropertyRepository.save(listproperty);
}

//Delete property
@Transactional
@DeleteMapping("/delete/property/{id}")
public ResponseEntity<String> deleteByProperty_name(@PathVariable ("id") String id){
	listpropertyRepository.deleteById(id);
	return new ResponseEntity<>("Property has been deleted", HttpStatus.OK);
	
}


//Create new property  
Map<String, String> errors;

  @PostMapping("/createProperty/{id}")
  public ResponseEntity<Object> createProperty(@RequestBody @Valid ListPropertyEntity listproperty, BindingResult bindingResult, @PathVariable ("id") Long id ){
	
	if(bindingResult.hasErrors()) {
		
	errors = new HashMap<>();
	for(FieldError error:bindingResult.getFieldErrors()) {
		
	errors.put(error.getField(), error.getDefaultMessage());
	}
	
	return new ResponseEntity<>(errors, HttpStatus.NOT_ACCEPTABLE);
	}
	
	ListPropertyEntity list_property = listpropertyRepository.findByEmail(listproperty.getEmail());
	
	if(list_property!=null) {
	return new ResponseEntity<>(HttpStatus.CONFLICT);
	}
	
	UserEntity userEntity= null;
	userEntity=userRepository.getOne(id);
	listproperty.setUserEntity(userEntity);
	
	return new ResponseEntity<>(listpropertyRepository.save(listproperty),HttpStatus.OK);
	
  }
  }



  






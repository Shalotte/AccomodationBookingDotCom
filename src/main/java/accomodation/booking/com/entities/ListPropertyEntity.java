package accomodation.booking.com.entities;


import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;
<<<<<<< HEAD
import org.hibernate.validator.constraints.Range;
=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "property")

public class ListPropertyEntity  {

	 @Id
	 @Column(name="booking_id")
	 @GeneratedValue(generator="system-uuid")
	 @GenericGenerator(name="system-uuid", strategy= "uuid")
	 private String id;
	 
	 @ManyToOne
	 private UserEntity user_entity;
	 
	 @OneToMany(mappedBy="listPropertyEntity" )
	 private Set<BookingEntity> bookingEntity;

	 @NotBlank(message="Please enter your property name.")
	 @Size(min=2, message= "Your property name must be wrong.")
	 @Column(name="property_name")
	 private String property_name;
	 

	 @Email(message="Please Enter a Valid Email")
     @NotBlank(message="Please enter property email address.")
	 @Column(name="property_email")
	 private String email;
	 
	 @NotBlank(message= "Please enter property manager name.")
	 @Size(min=2, message= "Your property manager name must be wrong.")
	 @Column(name = "property_manager_name")
	 private String property_manager_name;
	 
	 @NotBlank(message="Please your phone number.")
	 @Size(min=2, message= "Your phone number must be wrong.")
	 @Column(name="property_manager_contact_details")
	 private String property_manager_contact_details;
	 
	 @NotBlank(message="Please your street address.")
	 @Size(min=2, message= "Your street address must be wrong.")
	 @Column(name="property_street_address")
	 private String property_street_address;
	 
	 @NotBlank(message="Please your city name.")
	 @Size(min=2, message= "Your city name must be wrong.")
	 @Column(name="property_city_name")
	 private String property_city_name;
	 
	 @NotBlank(message="Please enter your country name.")
	 @Size(min=2, message= "Your country name must be wrong.")
	 @Column(name = "property_country_name")
	 private String property_country_name;
	 
	 @NotNull(message="Please your zip code.")
<<<<<<< HEAD
	 @Range(min=2, max =100000,message= "Your zip code must be wrong.")
=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	 @Column(name="zip_code")
	 private Integer zip_code;
	 
	 @NotBlank(message="Please your apartment name.")
	 @Size(min=2, message= "Your apartment name must be wrong.")
	 @Column(name="apartment_type")
	 private String apartment_type;
	 
	 @NotNull(message="Please number of bedrooms.")
<<<<<<< HEAD
	 @Range(min=1, max=1000, message= "The number of bedrooms should be atleast 1.")
	 @Column(name = "number_of_bedrooms")
	 private Integer number_of_bedrooms;
	 
	 @NotNull(message="Please number of living rooms.")
	 @Range(min=1,max=100, message= "The number of living rooms should be atleast 1.")
=======
	 @Column(name = "number_of_bedrooms")
	 private Integer number_of_bedrooms;
	 
	 @NotNull(message="Please number of bedrooms.")
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	 @Column(name="number_of_living_rooms")
	 private Integer number_of_living_rooms;
	 
	 @NotNull(message="Please number of bathrooms.")
<<<<<<< HEAD
	 @Range(min=1,max=100, message= "The number of bathrooms should be atleast 1.")
	 @Column(name="number_of_bathrooms")
	 private Integer number_of_bathrooms;
	 
	 @NotNull(message="Please enter price per night.")
	 @Range(min=1,max=100000, message= "The price per night should be atleast one digits.")
=======
	 @Column(name="number_of_bathrooms")
	 private Integer number_of_bathrooms;
	 
	 @NotNull(message="Please number of bathrooms.")
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	 @Column(name="price_per_night")
	 private Integer price_per_night;
	 
	 @NotBlank(message="Please enter the internet availability.")
	 @Size(min=2, message= "The availability should be specified.")
	 @Column(name="internet_available")
	 private String internet_available;
	 
	 @NotBlank(message="Please enter if the internet is available.")
	 @Size(min=2, message= "It must be specified if there is free internet.")
	 @Column(name="free_internet")
	 private String free_internet;
	 
	 @NotBlank(message="Please enter information about availability of parking.")
	 @Size(min=2, message= "It must be specified if there is parking available.")
	 @Column(name="parking_available")
	 private String parking_available;
	 
	 @NotBlank(message="Please enter the language spoken.")
	 @Size(min=2, message= "The language spoken should be specified.")
	 @Column(name="language_spoken")
	 private String language_spoken;
	 
	 @NotBlank(message="Is smoking allowed?")
	 @Size(min=2, message= "Please provide information on smoking permission.")
	 @Column(name="smoking_allowed")
	 private String smoking_allowed;
	 
	 @NotBlank(message="Are children accommodated?")
	 @Size(min=2, message= "Please enter information on children accommodation.")
	 @Column(name="children_accommodated")
	 private String children_accommodated;
	 
	 @NotNull(message="Please enter minimum stay.")
<<<<<<< HEAD
	 @Range(min=1, max=30,message= "The minimum number of nights stay should be atleast one.")
=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	 @Column(name="minimum_stay")
	 private Integer minimum_stay;
	 
	 @NotBlank(message="Please enter information on payment method.")
	 @Size(min=2, message= "A payment method should be specified.")
	 @Column(name="payment_method")
	 private String payment_method;
	 
	 @NotBlank(message="Do you charge for cleaning fees?")
	 @Size(min=2, message= "Please enter information on cleaning fees.")
	 @Column(name="cleaning_fees")
	 private String cleaning_fees;
	 
<<<<<<< HEAD
 
	 @NotNull(message="Please number of guests.")
	 @Range(min=1, max=1000, message= "The number of guests should be atleast 1.")
	 @Column(name="guests")
	 private Integer guests;
	 
	 
	

	 public ListPropertyEntity() {
	 }
	
	 public ListPropertyEntity(String id, UserEntity user_entity, Set<BookingEntity> bookingEntity,
			@NotBlank(message = "Please enter your property name.") @Size(min = 2, message = "Your property name must be wrong.") String property_name,
			@Email(message = "Please Enter a Valid Email") @NotBlank(message = "Please enter property email address.") String email,
			@NotBlank(message = "Please enter property manager name.") @Size(min = 2, message = "Your property manager name must be wrong.") String property_manager_name,
			@NotBlank(message = "Please your phone number.") @Size(min = 2, message = "Your phone number must be wrong.") String property_manager_contact_details,
			@NotBlank(message = "Please your street address.") @Size(min = 2, message = "Your street address must be wrong.") String property_street_address,
			@NotBlank(message = "Please your city name.") @Size(min = 2, message = "Your city name must be wrong.") String property_city_name,
			@NotBlank(message = "Please enter your country name.") @Size(min = 2, message = "Your country name must be wrong.") String property_country_name,
			@NotNull(message = "Please your zip code.") @Size(min = 2, message = "Your zip code must be wrong..") Integer zip_code,
			@NotBlank(message = "Please your apartment name.") @Size(min = 2, message = "Your apartment name must be wrong.") String apartment_type,
			@NotNull(message = "Please number of bedrooms.") @Size(min = 1, message = "The number of bedrooms should be atleast 1.") Integer number_of_bedrooms,
			@NotNull(message = "Please number of living rooms.") @Size(min = 1, message = "The number of living rooms should be atleast 1.") Integer number_of_living_rooms,
			@NotNull(message = "Please number of bathrooms.") @Size(min = 1, message = "The number of bathrooms should be atleast 1.") Integer number_of_bathrooms,
			@NotNull(message = "Please enter price per night.") @Size(min = 1, message = "The price per night should be atleast one digits.") Integer price_per_night,
			@NotBlank(message = "Please enter the internet availability.") @Size(min = 2, message = "The availability should be specified.") String internet_available,
			@NotBlank(message = "Please enter if the internet is available.") @Size(min = 2, message = "It must be specified if there is free internet.") String free_internet,
			@NotBlank(message = "Please enter information about availability of parking.") @Size(min = 2, message = "It must be specified if there is parking available.") String parking_available,
			@NotBlank(message = "Please enter the language spoken.") @Size(min = 2, message = "The language spoken should be specified.") String language_spoken,
			@NotBlank(message = "Is smoking allowed?") @Size(min = 2, message = "Please provide information on smoking permission.") String smoking_allowed,
			@NotBlank(message = "Are children accommodated?") @Size(min = 2, message = "Please enter information on children accommodation.") String children_accommodated,
			@NotNull(message = "Please enter minimum stay.") @Size(min = 1, message = "The minimum number of nights stay should be atleast one.") Integer minimum_stay,
			@NotBlank(message = "Please enter information on payment method.") @Size(min = 2, message = "A payment method should be specified.") String payment_method,
			@NotBlank(message = "Do you charge for cleaning fees?") @Size(min = 2, message = "Please enter information on cleaning fees.") String cleaning_fees,
			@NotNull(message = "How many guests are accommodated") @Range(min = 2, max=1000,message = "Please enter the number of guests accommodated.") Integer guests) {
		super();
		this.id = id;
		this.user_entity = user_entity;
		this.bookingEntity = bookingEntity;
		this.property_name = property_name;
		this.email = email;
		this.property_manager_name = property_manager_name;
		this.property_manager_contact_details = property_manager_contact_details;
		this.property_street_address = property_street_address;
		this.property_city_name = property_city_name;
		this.property_country_name = property_country_name;
		this.zip_code = zip_code;
		this.apartment_type = apartment_type;
		this.number_of_bedrooms = number_of_bedrooms;
		this.number_of_living_rooms = number_of_living_rooms;
		this.number_of_bathrooms = number_of_bathrooms;
		this.price_per_night = price_per_night;
		this.internet_available = internet_available;
		this.free_internet = free_internet;
		this.parking_available = parking_available;
		this.language_spoken = language_spoken;
		this.smoking_allowed = smoking_allowed;
		this.children_accommodated = children_accommodated;
		this.minimum_stay = minimum_stay;
		this.payment_method = payment_method;
		this.cleaning_fees = cleaning_fees;
		this.guests = guests;
	}
=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653

	public String getId() {
		return id;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public void setId(String id) {
		this.id = id;
	}

<<<<<<< HEAD
    @JsonIgnore
	public UserEntity getUser_entity() {
		return user_entity;
	}


	public void setUser_entity(UserEntity user_entity) {
		this.user_entity = user_entity;
	}


	public Set<BookingEntity> getBookingEntity() {
		return bookingEntity;
	}


	public void setBookingEntity(Set<BookingEntity> bookingEntity) {
		this.bookingEntity = bookingEntity;
	}


=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public String getProperty_name() {
		return property_name;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public void setProperty_name(String property_name) {
		this.property_name = property_name;
	}

<<<<<<< HEAD

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public String getProperty_manager_name() {
		return property_manager_name;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public void setProperty_manager_name(String property_manager_name) {
		this.property_manager_name = property_manager_name;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public String getProperty_manager_contact_details() {
		return property_manager_contact_details;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public void setProperty_manager_contact_details(String property_manager_contact_details) {
		this.property_manager_contact_details = property_manager_contact_details;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public String getProperty_street_address() {
		return property_street_address;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public void setProperty_street_address(String property_street_address) {
		this.property_street_address = property_street_address;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public String getProperty_city_name() {
		return property_city_name;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public void setProperty_city_name(String property_city_name) {
		this.property_city_name = property_city_name;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public String getProperty_country_name() {
		return property_country_name;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public void setProperty_country_name(String property_country_name) {
		this.property_country_name = property_country_name;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public Integer getZip_code() {
		return zip_code;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public void setZip_code(Integer zip_code) {
		this.zip_code = zip_code;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public String getApartment_type() {
		return apartment_type;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public void setApartment_type(String apartment_type) {
		this.apartment_type = apartment_type;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public Integer getNumber_of_bedrooms() {
		return number_of_bedrooms;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public void setNumber_of_bedrooms(Integer number_of_bedrooms) {
		this.number_of_bedrooms = number_of_bedrooms;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public Integer getNumber_of_living_rooms() {
		return number_of_living_rooms;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public void setNumber_of_living_rooms(Integer number_of_living_rooms) {
		this.number_of_living_rooms = number_of_living_rooms;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public Integer getNumber_of_bathrooms() {
		return number_of_bathrooms;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public void setNumber_of_bathrooms(Integer number_of_bathrooms) {
		this.number_of_bathrooms = number_of_bathrooms;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public Integer getPrice_per_night() {
		return price_per_night;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public void setPrice_per_night(Integer price_per_night) {
		this.price_per_night = price_per_night;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public String getInternet_available() {
		return internet_available;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public void setInternet_available(String internet_available) {
		this.internet_available = internet_available;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public String getFree_internet() {
		return free_internet;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public void setFree_internet(String free_internet) {
		this.free_internet = free_internet;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public String getParking_available() {
		return parking_available;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public void setParking_available(String parking_available) {
		this.parking_available = parking_available;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public String getLanguage_spoken() {
		return language_spoken;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public void setLanguage_spoken(String language_spoken) {
		this.language_spoken = language_spoken;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public String getSmoking_allowed() {
		return smoking_allowed;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public void setSmoking_allowed(String smoking_allowed) {
		this.smoking_allowed = smoking_allowed;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public String getChildren_accommodated() {
		return children_accommodated;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public void setChildren_accommodated(String children_accommodated) {
		this.children_accommodated = children_accommodated;
	}


	public Integer getMinimum_stay() {
		return minimum_stay;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public void setMinimum_stay(Integer minimum_stay) {
		this.minimum_stay = minimum_stay;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public String getPayment_method() {
		return payment_method;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public String getCleaning_fees() {
		return cleaning_fees;
	}

<<<<<<< HEAD

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public void setCleaning_fees(String cleaning_fees) {
		this.cleaning_fees = cleaning_fees;
	}

<<<<<<< HEAD

	public Integer getGuests() {
		return guests;
	}


	public void setGuests(Integer guests) {
		this.guests = guests;
	}
	
	 
	
	@Override
	public String toString() {
		return "ListPropertyEntity [id=" + id + ", user_entity=" + user_entity + ", bookingEntity=" + bookingEntity
				+ ", property_name=" + property_name + ", email=" + email + ", property_manager_name="
=======
	
	//@ManyToOne
	//@JoinColumn(name = "user_id")
	//private UserEntity userEntity;
	@JsonIgnore
	public UserEntity getUserEntity() {
		return user_entity;
	}

	public void setUserEntity(UserEntity user_entity) {
		this.user_entity = user_entity;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "ListPropertyEntity [id=" + id + ", property_name=" + property_name + ", property_manager_name="
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
				+ property_manager_name + ", property_manager_contact_details=" + property_manager_contact_details
				+ ", property_street_address=" + property_street_address + ", property_city_name=" + property_city_name
				+ ", property_country_name=" + property_country_name + ", zip_code=" + zip_code + ", apartment_type="
				+ apartment_type + ", number_of_bedrooms=" + number_of_bedrooms + ", number_of_living_rooms="
				+ number_of_living_rooms + ", number_of_bathrooms=" + number_of_bathrooms + ", price_per_night="
				+ price_per_night + ", internet_available=" + internet_available + ", free_internet=" + free_internet
				+ ", parking_available=" + parking_available + ", language_spoken=" + language_spoken
				+ ", smoking_allowed=" + smoking_allowed + ", children_accommodated=" + children_accommodated
<<<<<<< HEAD
				+ ", minimum_stay=" + minimum_stay + ", payment_method=" + payment_method + ", cleaning_fees="
				+ cleaning_fees + ", guests=" + guests + "]";
	}


=======
				+  ", minimum_stay=" + minimum_stay + ", payment_method="
				+ payment_method + ", cleaning_fees=" + cleaning_fees + "]";
	}

	public ListPropertyEntity() {

	}

	public ListPropertyEntity(String property_name, String property_manager_name,
			String property_manager_contact_details, String property_street_address, String property_city_name,
			String property_country_name, Integer zip_code, String apartment_type, Integer number_of_bedrooms,
			Integer number_of_living_rooms, Integer number_of_bathrooms, Integer price_per_night, String internet_available,
			String free_internet, String parking_available, String language_spoken, String smoking_allowed,
			String children_accommodated, String pets_allowed, Integer minimum_stay, String payment_method,
			String cleaning_fees) {
		super();
		this.property_name = property_name;
		this.property_manager_name = property_manager_name;
		this.property_manager_contact_details = property_manager_contact_details;
		this.property_street_address = property_street_address;
		this.property_city_name = property_city_name;
		this.property_country_name = property_country_name;
		this.zip_code = zip_code;
		this.apartment_type = apartment_type;
		this.number_of_bedrooms = number_of_bedrooms;
		this.number_of_living_rooms = number_of_living_rooms;
		this.number_of_bathrooms = number_of_bathrooms;
		this.price_per_night = price_per_night;
		this.internet_available = internet_available;
		this.free_internet = free_internet;
		this.parking_available = parking_available;
		this.language_spoken = language_spoken;
		this.smoking_allowed = smoking_allowed;
		this.children_accommodated = children_accommodated;
		this.minimum_stay = minimum_stay;
		this.payment_method = payment_method;
		this.cleaning_fees = cleaning_fees;
	}
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	
	

	
		
}

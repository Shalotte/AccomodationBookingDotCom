package accomodation.booking.com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonIgnore;

=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
@Entity
@Table(name="bookings")
public class BookingEntity {
	
	 @Id
	 @Column(name="booking_id")
	 @GeneratedValue(generator="system-uuid")
	 @GenericGenerator(name="system-uuid", strategy= "uuid")
	 private String id;
	 
	 @ManyToOne
<<<<<<< HEAD
	 private UserEntity user_entity;
	 
	 @OneToOne(mappedBy="bookingEntity")
=======
	 @Cascade( value = org.hibernate.annotations.CascadeType.ALL)
	 private UserEntity user_entity;
	 
	 @OneToOne
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	 private PaymentEntity paymentEntity;
	 
	 @ManyToOne
	 private ListPropertyEntity listPropertyEntity;

	@Column(name="title")
	 @NotBlank(message = "Please Enter your title")
	 private String title;
	 
	 @Column(name="first_name")
	 @NotBlank(message = "Please Enter your first name")
	 private String first_name;
	 
	 @Column(name="last_name")
	 @NotBlank(message = "Please Enter your last name")
	 private String last_name;
	 
	 
	 @Column(name="email_address")
	 @NotBlank(message = "Please Enter your email address")
	 private String email_address;
	 
	 @Column(name="street_address")
	 @NotBlank(message = "Please Enter your street address")
	 private String street_address;
	 
	 @Column(name="city")
	 @NotBlank(message = "Please Enter your city name")
	 private String city;
	 
	 @Column(name="zip_code")
	 @NotBlank(message = "Please Enter the zip code")
	 private String zip_code;
	 
	 @Column(name="country")
	 @NotBlank(message = "Please Enter your country name")
	 private String country;
	 
	 @Column(name="telephone")
	 @NotBlank(message = "Please Enter your phone Number")
	 private String telephone;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

<<<<<<< HEAD
	@JsonIgnore
=======
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public UserEntity getUser_entity() {
		return user_entity;
	}

	public void setUser_entity(UserEntity user_entity) {
		this.user_entity = user_entity;
	}
<<<<<<< HEAD
	
	@JsonIgnore
=======

	public PaymentEntity getPaymentEntity() {
		return paymentEntity;
	}

	public void setPaymentEntity(PaymentEntity paymentEntity) {
		this.paymentEntity = paymentEntity;
	}

>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
	public ListPropertyEntity getListPropertyEntity() {
		return listPropertyEntity;
	}

	public void setListPropertyEntity(ListPropertyEntity listPropertyEntity) {
		this.listPropertyEntity = listPropertyEntity;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	public String getStreet_address() {
		return street_address;
	}

	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

<<<<<<< HEAD
	public BookingEntity(String id, UserEntity user_entity,
=======
	public BookingEntity(String id, UserEntity user_entity, PaymentEntity paymentEntity,
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
			ListPropertyEntity listPropertyEntity, @NotBlank(message = "Please Enter your title") String title,
			@NotBlank(message = "Please Enter your first name") String first_name,
			@NotBlank(message = "Please Enter your last name") String last_name,
			@NotBlank(message = "Please Enter your email address") String email_address,
			@NotBlank(message = "Please Enter your street address") String street_address,
			@NotBlank(message = "Please Enter your city name") String city,
			@NotBlank(message = "Please Enter the zip code") String zip_code,
			@NotBlank(message = "Please Enter your country name") String country,
			@NotBlank(message = "Please Enter your phone Number") String telephone) {
		this.id = id;
		this.user_entity = user_entity;
<<<<<<< HEAD
=======
		this.paymentEntity = paymentEntity;
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
		this.listPropertyEntity = listPropertyEntity;
		this.title = title;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email_address = email_address;
		this.street_address = street_address;
		this.city = city;
		this.zip_code = zip_code;
		this.country = country;
		this.telephone = telephone;
	}

	public BookingEntity() {
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		return "BookingEntity [id=" + id + ", user_entity=" + user_entity 
=======
		return "BookingEntity [id=" + id + ", user_entity=" + user_entity + ", paymentEntity=" + paymentEntity
>>>>>>> d1f72d543312810b0f1c62ceedc13ff97117c653
				+ ", listPropertyEntity=" + listPropertyEntity + ", title=" + title + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", email_address=" + email_address + ", street_address=" + street_address
				+ ", city=" + city + ", zip_code=" + zip_code + ", country=" + country + ", telephone=" + telephone
				+ "]";
	} 	

}

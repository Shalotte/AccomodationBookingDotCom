package accomodation.booking.com.entities;


import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")

public class UserEntity {

//Details
        @Id 
		@Column(name="user_id")
		@GeneratedValue
		private Long id;
		
		@OneToMany(mappedBy="user_entity")
		@Cascade( value = org.hibernate.annotations.CascadeType.ALL)
		private Set<PaymentEntity> paymentEntity;
		
		@OneToMany(mappedBy="user_entity")
		@Cascade( value = org.hibernate.annotations.CascadeType.ALL)
		private Set<BookingEntity> booking_entity;
		
		@OneToMany(mappedBy="user_entity")
		private Set<ListPropertyEntity> list_proprty;

		
		@Email(message="Please Enter a Valid Email")
		@NotBlank(message="Please Enter your Email.")
		@Column(name="email")
	    private String email;
		
		@NotBlank(message= "Please Enter your Password")
	    @Size(min=4, message= "Invalid Password, Enter atleast 4 Characters.")
	    @Column(name="password")
	    private String password;
	    
		@NotBlank(message = "Please Enter your Phone Number")
		@Size(min=4, message= "Your phone number must be atleast 10 digits.")
	    @Column(name="phone")
	    private String phone;
	    
	    @Column(name="type")
	    private String type;
	    
	    
	    @NotBlank(message="Please Enter your First Name")
	    @Size(min=2, message= "Your First Name must be Wrong")
	    @Column(name="first_name")
	    private String first_name;
	    
	    
	    @NotBlank(message="Please Enter your Last Name")
	    @Size(min=2, message= "Your Last Name must be Wrong")
	    @Column(name="last_name")
	    private String last_name;
	    
		public UserEntity() {
		}

	

		public UserEntity(Long id, Set<PaymentEntity> paymentEntity, Set<BookingEntity> booking_entity,
				Set<ListPropertyEntity> list_proprty,
				@Email(message = "Please Enter a Valid Email") @NotBlank(message = "Please Enter your Email") String email,
				@NotBlank(message = "Please Enter your Password") @Size(min = 4, message = "Invalid Password, Enter atleast 4 Characters") String password,
				@NotBlank(message = "Please Enter your Phone Number") String phone, String type,
				@NotBlank(message = "Please Enter your First Name") @Size(min = 2, message = "Your First Name must be Wrong") String first_name,
				@NotBlank(message = "Please Enter your Last Name") @Size(min = 2, message = "Your Last Name must be Wrong") String last_name) {
			super();
			this.id = id;
			this.paymentEntity = paymentEntity;
			this.booking_entity = booking_entity;
			this.list_proprty = list_proprty;
			this.email = email;
			this.password = password;
			this.phone = phone;
			this.type = type;
			this.first_name = first_name;
			this.last_name = last_name;
		}

	    
	
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Set<PaymentEntity> getPaymentEntity() {
			return paymentEntity;
		}

		public void setPaymentEntity(Set<PaymentEntity> paymentEntity) {
			this.paymentEntity = paymentEntity;
		}

		public Set<BookingEntity> getBooking_entity() {
			return booking_entity;
		}
        
		
		public void setBooking_entity(Set<BookingEntity> booking_entity) {
			this.booking_entity = booking_entity;
		}

	
		public Set<ListPropertyEntity> getList_proprty() {
		return list_proprty;
		}

		public void setList_proprty(Set<ListPropertyEntity> list_proprty) {
		this.list_proprty = list_proprty;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
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

		@Override
		public String toString() {
			return "UserEntity [id=" + id + ", paymentEntity=" + paymentEntity + ", booking_entity=" + booking_entity
					+ ", email=" + email + ", password=" + password + ", phone=" + phone + ", type=" + type
					+ ", first_name=" + first_name + ", last_name=" + last_name + "]";
		}

	
		
	    }
	  
	


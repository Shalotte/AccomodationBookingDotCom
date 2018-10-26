package accomodation.booking.com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name ="destinations")
public class DestinationEntity {
	
   @Id 
   @GeneratedValue(generator="system-uuid")
   @GenericGenerator(name="system-uuid", strategy = "uuid")
   private String id;

   @Column(name="destination")
   private String destination;

   @Column(name="date")
   private String date;

   @Column(name = "rooms")
   private int rooms;

   @Column(name = "guests")
   private int guests;
   
   @Column(name="manager_name")
   private String manager_name;
   
   @Column(name="contact_details")
   private String contact_details;
   
   @Column(name="guest_house_name")
   private String guest_house_name;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	this.destination = destination;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public int getRooms() {
	return rooms;
}

public void setRooms(int rooms) {
	this.rooms = rooms;
}

public int getGuests() {
	return guests;
}

public void setGuests(int guests) {
	this.guests = guests;
}

public String getManager_name() {
	return manager_name;
}

public void setManager_name(String manager_name) {
	this.manager_name = manager_name;
}

public String getContact_details() {
	return contact_details;
}

public void setContact_details(String contact_details) {
	this.contact_details = contact_details;
}

public String getGuest_house_name() {
	return guest_house_name;
}

public void setGuest_house_name(String guest_house_name) {
	this.guest_house_name = guest_house_name;
}


public DestinationEntity() {
}

public DestinationEntity(String id, String destination, String date, int rooms, int guests, String manager_name,
		String contact_details, String guest_house_name) {
	super();
	this.id = id;
	this.destination = destination;
	this.date = date;
	this.rooms = rooms;
	this.guests = guests;
	this.manager_name = manager_name;
	this.contact_details = contact_details;
	this.guest_house_name = guest_house_name;
}

@Override
public String toString() {
	return "DestinationEntity [id=" + id + ", destination=" + destination + ", date=" + date + ", rooms=" + rooms
			+ ", guests=" + guests + ", manager_name=" + manager_name + ", contact_details=" + contact_details
			+ ", guest_house_name=" + guest_house_name + "]";
}

}



   



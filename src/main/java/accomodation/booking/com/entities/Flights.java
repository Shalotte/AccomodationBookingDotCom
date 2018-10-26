package accomodation.booking.com.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flights")

public class Flights {
	
  @Id 
  @Column(name="flight_id")
  @GeneratedValue
  private Long id;
  
  @Column(name="flight_no")
  private String flight_no;
  
  @Column(name="origion")
  private String origin;
  
  @Column(name="destination")
  private String destination;
  
  @Column(name="date")
  private String date;
  
  @Column(name="departure_time")
  private String depart;
  
  @Column(name="arrive_time")
  private String arrive;
  
  @Column(name="cost")
  private String amount;
  

public Flights(Long id, String flight_no, String origin, String destination, String date, String depart, String arrive,
		String amount) {
	
	this.id = id;
	this.flight_no = flight_no;
	this.origin = origin;
	this.destination = destination;
	this.date = date;
	this.depart = depart;
	this.arrive = arrive;
	this.amount = amount;
}

public Flights() {
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getFlight_no() {
	return flight_no;
}

public void setFlight_no(String flight_no) {
	this.flight_no = flight_no;
}

public String getOrigin() {
	return origin;
}

public void setOrigin(String origin) {
	this.origin = origin;
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

public String getDepart() {
	return depart;
}

public void setDepart(String depart) {
	this.depart = depart;
}

public String getArrive() {
	return arrive;
}

public void setArrive(String arrive) {
	this.arrive = arrive;
}

public String getAmount() {
	return amount;
}

public void setAmount(String amount) {
	this.amount = amount;
}

@Override
public String toString() {
	return "Flights [id=" + id + ", flight_no=" + flight_no + ", origin=" + origin + ", destination=" + destination
			+ ", date=" + date + ", depart=" + depart + ", arrive=" + arrive + ", amount=" + amount + "]";
}
  
  


  
  
  
  

}

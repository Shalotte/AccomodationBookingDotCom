package accomodation.booking.com.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Time")
public class Time {
	
	@Id
	@Column(name="departure_time")
	private String depart;
	
	@Column(name="arrival_time")
	private String arrive;
	
	public Time() {
	
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

	public Time(String depart, String arrive) {
		super();
		this.depart = depart;
		this.arrive = arrive;
	}
	
	

}

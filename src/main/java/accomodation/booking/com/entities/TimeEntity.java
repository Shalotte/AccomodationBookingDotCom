package accomodation.booking.com.entities;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "Time")
public class TimeEntity {
	
	@Id
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name="departure_time")
	private String depart;
	
	@Column(name="arrival_time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private String arrive;

	public TimeEntity() {
	}

	
	public String getDepart() {
		return depart;
	}


	public void setDepart(String depart) {
		this.depart = depart;
	}


	public TimeEntity(String depart, String arrive) {
		super();
		this.depart = depart;
		this.arrive = arrive;
	}


	public String getArrive() {
		return arrive;
	}


	public void setArrive(String arrive) {
		this.arrive = arrive;
	}


	@Override
	public String toString() {
		return "TimeEntity [depart=" + depart + ", arrive=" + arrive + "]";
	}
	
	
	
	

}

package accomodation.booking.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import accomodation.booking.com.entities.Flights;

public interface FlightRepository extends JpaRepository<Flights,Long> {

}

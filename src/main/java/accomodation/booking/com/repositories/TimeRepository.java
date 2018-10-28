package accomodation.booking.com.repositories;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import accomodation.booking.com.entities.TimeEntity;

public interface TimeRepository extends JpaRepository<TimeEntity, Date> {

}

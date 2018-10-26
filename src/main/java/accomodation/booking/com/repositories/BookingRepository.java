package accomodation.booking.com.repositories;

import org.springframework.data.repository.CrudRepository;

import accomodation.booking.com.entities.BookingEntity;

public interface BookingRepository extends CrudRepository <BookingEntity, String> {

}

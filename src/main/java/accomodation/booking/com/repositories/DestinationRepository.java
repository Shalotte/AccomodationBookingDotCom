package accomodation.booking.com.repositories;

import org.springframework.data.repository.CrudRepository;
import accomodation.booking.com.entities.DestinationEntity;


public interface DestinationRepository extends CrudRepository  <DestinationEntity, String> {

}

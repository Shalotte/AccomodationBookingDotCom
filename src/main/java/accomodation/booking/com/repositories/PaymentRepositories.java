package accomodation.booking.com.repositories;

import org.springframework.data.repository.CrudRepository;
import accomodation.booking.com.entities.PaymentEntity;

public interface PaymentRepositories extends CrudRepository <PaymentEntity, Long>{

}

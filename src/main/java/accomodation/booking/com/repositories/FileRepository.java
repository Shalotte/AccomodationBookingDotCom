package accomodation.booking.com.repositories;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import accomodation.booking.com.entities.FileModel;

@Transactional
public interface FileRepository extends JpaRepository <FileModel, Long> {

}

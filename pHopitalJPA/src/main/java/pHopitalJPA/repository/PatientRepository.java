package pHopitalJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pHopitalJPA.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

	List<Patient> findAllWithVisites();
	
	Patient findPersoByKeyWithVisites(@Param("numero") Integer numero);

	@Query("select a from Patient a ")
	List<Patient> findPerso();

}
	
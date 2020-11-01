package HealthcareDemo.HealthcareDemo.repositories;

import HealthcareDemo.HealthcareDemo.models.Medication;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.math.BigInteger;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "medication", path = "medications")
public interface MedicationRepository extends MongoRepository<Medication, BigInteger> {
    List<Medication> findByMedName(@Param("name") String name);
}

package HealthcareDemo.HealthcareDemo.repositories;

import HealthcareDemo.HealthcareDemo.models.Medication;
import HealthcareDemo.HealthcareDemo.models.Patient;
import HealthcareDemo.HealthcareDemo.models.Provider;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import java.math.BigInteger;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "patient", path = "patients")
public interface PatientRepository extends MongoRepository<Patient, BigInteger> {
    List<Patient> findByLastName(@Param("name") String name);

    //List<Medication> findByMedName(@Param("medName") String medName);
    //List<Provider> findByDocLastName(@Param("name") String name);
}

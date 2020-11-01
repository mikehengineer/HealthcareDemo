package HealthcareDemo.HealthcareDemo.repositories;

import HealthcareDemo.HealthcareDemo.models.Medication;
import HealthcareDemo.HealthcareDemo.models.Provider;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.math.BigInteger;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "provider", path = "providers")
public interface ProviderRepository extends MongoRepository<Provider, BigInteger>  {
    List<Provider> findByDocLastName(@Param("name") String name);
}
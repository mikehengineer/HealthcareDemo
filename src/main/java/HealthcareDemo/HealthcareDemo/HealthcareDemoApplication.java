package HealthcareDemo.HealthcareDemo;

import HealthcareDemo.HealthcareDemo.models.Medication;
import HealthcareDemo.HealthcareDemo.models.Patient;
import HealthcareDemo.HealthcareDemo.repositories.MedicationRepository;
import HealthcareDemo.HealthcareDemo.repositories.PatientRepository;
import HealthcareDemo.HealthcareDemo.repositories.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HealthcareDemoApplication implements CommandLineRunner {

	@Autowired
	private PatientRepository patientRepository;
	@Autowired
	private MedicationRepository medicationRepository;
	@Autowired
	private ProviderRepository providerRepository;

	public static void main(String[] args) {

		SpringApplication.run(HealthcareDemoApplication.class, args);

	}

	@Override
	public void run(String... strings) throws Exception {
		patientRepository.deleteAll();
		medicationRepository.deleteAll();
		providerRepository.deleteAll();


		final Medication med1 = new Medication("HCQ", 17.0, false);
		final Medication med2 = new Medication("HCQ", 45.0, false);
		final Medication med3 = new Medication("Regeneron", 45.0, false);
		final Patient pat1 = new Patient("John", "Miller", "777");
		final Patient pat2 = new Patient("Mike", "House", "777");
		final Patient pat3 = new Patient("Eric", "Miller", "777");

		medicationRepository.save(med1);
		medicationRepository.save(med2);
		medicationRepository.save(med3);

		patientRepository.save(pat1);
		patientRepository.save(pat2);
		patientRepository.save(pat3);
		medicationRepository.findAll().forEach(System.out::println);
		patientRepository.findByLastName("Miller").forEach(System.out::println);

	}
}

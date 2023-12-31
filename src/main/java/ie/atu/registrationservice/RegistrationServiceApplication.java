package ie.atu.registrationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableFeignClients
@SpringBootApplication
public class RegistrationServiceApplication{

	public static void main(String[] args) {SpringApplication.run(RegistrationServiceApplication.class, args);}
}

package ma.solide.springdatarest;

import ma.solide.springdatarest.model.User;
import ma.solide.springdatarest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataRestTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestTutorialApplication.class, args);
	}

}

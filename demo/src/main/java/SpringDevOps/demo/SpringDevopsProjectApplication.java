package SpringDevOps.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class SpringDevopsProjectApplication {

	@GetMapping("/get")
	public String getMessage () {

		return "Welcome To Joe Tech";|
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDevopsProjectApplication.class, args);
	}

}

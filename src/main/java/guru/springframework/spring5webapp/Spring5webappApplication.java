package guru.springframework.spring5webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class Spring5webappApplication {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World!";
	}


	public static void main(String[] args) {
		SpringApplication.run(Spring5webappApplication.class, args);
	}
}

package fr.liaud1u.potatoesdiscoverservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PotatoesDiscoverServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PotatoesDiscoverServiceApplication.class, args);
	}

}

package vn.ifisolution.fresher12.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication(scanBasePackages={"vn.ifisolution.fresher12"})
@EnableCassandraRepositories("vn.ifisolution.fresher12.repository")
@EntityScan("vn.ifisolution.fresher12.entity") 
public class ApplicationConfig{ 

	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfig.class, args);
	}

	
}

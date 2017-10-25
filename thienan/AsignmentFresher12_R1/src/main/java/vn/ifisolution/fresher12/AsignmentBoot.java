package vn.ifisolution.fresher12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import vn.ifisolution.fresher12.configuration.JpaConfigAsignment;


@Import(JpaConfigAsignment.class)
@SpringBootApplication(scanBasePackages={"vn.ifisolution.fresher12.*"})
public class AsignmentBoot {

	public static void main(String[] args) {
		SpringApplication.run(AsignmentBoot.class, args);
	}
}
	
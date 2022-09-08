package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.*;

@SpringBootApplication
public class TacoCloudApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplication.class, args);
	}

}

/*
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.web.servlet.support.*;

@SpringBootApplication
public class SpringBootTomcatApplication extends SpringBootServletInitializer {
*/




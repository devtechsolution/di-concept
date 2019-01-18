package org.devtech.diconcept;

import org.devtech.diconcept.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiConceptApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiConceptApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		controller.hello();

	}


}


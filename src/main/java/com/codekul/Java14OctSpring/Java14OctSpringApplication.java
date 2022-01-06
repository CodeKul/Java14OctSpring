package com.codekul.Java14OctSpring;

import com.codekul.Java14OctSpring.ioc.Jio;
import com.codekul.Java14OctSpring.ioc.Sim;
import com.codekul.Java14OctSpring.ioc.SimConfig;
import com.codekul.Java14OctSpring.ioc.Vodafone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Java14OctSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(Java14OctSpringApplication.class, args);

//		Vodafone vodafone = new Vodafone();
//		vodafone.calling();
//		vodafone.data();
//
//		Jio jio = new Jio();
//		jio.calling();
//		jio.data();

		ApplicationContext context = new AnnotationConfigApplicationContext(SimConfig.class);
		Sim sim = context.getBean(Jio.class);
		sim.calling();
		sim.data();
	}

	@GetMapping("hiiSpring")
	public String getMsg(){
		return "Hii Spring boot";
	}
}

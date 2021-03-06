package com.codekul.Java14OctSpring;

import com.codekul.Java14OctSpring.aop.BoyStudent;
import com.codekul.Java14OctSpring.aop.GirlStudent;
import com.codekul.Java14OctSpring.aop.Human;
import com.codekul.Java14OctSpring.aop.MyException;
import com.codekul.Java14OctSpring.di.Company;
import com.codekul.Java14OctSpring.ioc.Jio;
import com.codekul.Java14OctSpring.ioc.Sim;
import com.codekul.Java14OctSpring.ioc.SimConfig;
import com.codekul.Java14OctSpring.ioc.Vodafone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class Java14OctSpringApplication {


	private final static Logger logger = LoggerFactory.getLogger(Java14OctSpringApplication.class);

	public static void main(String[] args) throws SocketException, UnknownHostException, MyException {
		InetAddress addr = InetAddress.getLocalHost();

		ConfigurableApplicationContext applicationContext = SpringApplication.run(Java14OctSpringApplication.class, args);
//		Company company = applicationContext.getBean(Company.class);
//		company.showCompanyEmp();

//		Vodafone vodafone = new Vodafone();
//		vodafone.calling();
//		vodafone.data();
//
//		Jio jio = new Jio();
//		jio.calling();
//		jio.data();

//		ApplicationContext context = new AnnotationConfigApplicationContext(SimConfig.class);
//		Sim sim = context.getBean(Jio.class);
//		sim.calling();
//		sim.data();

//		Human human = applicationContext.getBean(Human.class);
//		human.wakeUp();

		BoyStudent boyStudent = applicationContext.getBean(BoyStudent.class);
		//jointPoint
//		int i = boyStudent.study(1);
//		System.out.println(i);
		//jointPoint
//		boyStudent.exce();

		logger.debug("debug");
		logger.info("info");
		logger.error("Error");
		logger.warn("warning");

//		GirlStudent girlStudent = applicationContext.getBean(GirlStudent.class);
//		girlStudent.studyChemistry();




	}



	@GetMapping("hiiSpring")
	public String getMsg(){
		return "Hii Spring boot";
	}
}

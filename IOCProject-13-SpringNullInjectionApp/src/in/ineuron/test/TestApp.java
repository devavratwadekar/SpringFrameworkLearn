package in.ineuron.test;

import java.util.Arrays;

//24 March 2023
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.PersonInfo;

public class TestApp {

	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");
		System.out.println("********Contsiner Started********");
		System.out.println("Bean Id is :: " + Arrays.toString(factory.getBeanDefinitionNames()));
		System.in.read();

		PersonInfo personInfo = factory.getBean("pinfo", PersonInfo.class);
		System.out.println(personInfo);

		factory.close();
		System.out.println("********Contsiner Stopped********");
	}

}

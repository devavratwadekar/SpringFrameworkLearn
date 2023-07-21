package in.ineuron.test;

import java.util.Arrays;

//23 March 2023
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Student;

public class TestApp {

	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");
		System.out.println("********Contsiner Started********");
		System.out.println("Bean Id is :: " + Arrays.toString(factory.getBeanDefinitionNames()));

		System.in.read();

		Student std1 = factory.getBean("in.ineuron.comp.Student#0", Student.class);
		System.out.println(std1);

		Student std2 = factory.getBean("in.ineuron.comp.Student#1", Student.class);
		System.out.println(std2);
		
		factory.close();
		System.out.println("\n********Contsiner Stopped********");
	}

}

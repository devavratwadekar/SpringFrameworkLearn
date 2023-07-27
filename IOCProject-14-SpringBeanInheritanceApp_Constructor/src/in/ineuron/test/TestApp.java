package in.ineuron.test;

import java.util.Arrays;

//24 March 2023
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Car;

public class TestApp {

	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");
		System.out.println("\n********Contsiner Started********");
		System.out.println("Bean Id is :: " + Arrays.toString(factory.getBeanDefinitionNames()));
		System.in.read();

		Car c1 = factory.getBean("car1", Car.class);
		System.out.println(c1 + " Available at :: " + c1.hashCode());

		Car c2 = factory.getBean("car2", Car.class);
		System.out.println(c2 + " Available at :: " + c2.hashCode());

		factory.close();
		System.out.println("\n********Contsiner Stopped********");
	}

}

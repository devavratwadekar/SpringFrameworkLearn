package in.ineuron.test;

//21 March 2023
import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.WishMessageGenerator;

public class TestApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");
		System.out.println("\nBean count is :: " + factory.getBeanDefinitionCount());
		System.out.println("Bean id is    :: " + Arrays.toString(factory.getBeanDefinitionNames()));
		System.out.println();

		WishMessageGenerator wmg = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println(wmg);

		factory.close();

	}

}

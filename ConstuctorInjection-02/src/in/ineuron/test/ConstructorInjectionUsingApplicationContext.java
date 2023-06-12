package in.ineuron.test;
//21 March 2023

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.ineuron.comp.WishMessageGenerator;

public class ConstructorInjectionUsingApplicationContext {

	public static void main(String[] args) throws Exception {

		System.out.println("*******ApplicationContext container starting*******\n");

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");

		System.out.println("No of bean is :: " + factory.getBeanDefinitionCount());
		System.out.println("Bean id is :: " + Arrays.toString(factory.getBeanDefinitionNames()));

		System.out.println("\n*******ApplicationContext container started*******");
		System.in.read();

		// Getting the bean from the container
		WishMessageGenerator wmg = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println("Hash code value of wmg :: " + wmg.hashCode());
		System.out.println(wmg);
		String result = wmg.generateMessage("sachin");
		System.out.println(result + "\n");

		// Getting the bean from the container
		WishMessageGenerator wmg1 = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println("Hash code value of wmg1 :: " + wmg1.hashCode());
		System.out.println(wmg1);
		String result1 = wmg1.generateMessage("kohli");
		System.out.println(result1 + "\n");
		// Using the Bean

		// Closing the container
		factory.close();
		System.out.println("**********Container is closed********");

	}

}

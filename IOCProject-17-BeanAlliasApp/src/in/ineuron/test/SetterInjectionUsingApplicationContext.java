package in.ineuron.test;

//27 March 2023
import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.ineuron.comp.WishMessageGenerator;

public class SetterInjectionUsingApplicationContext {

	public static void main(String[] args) throws Exception {

		ApplicationContext factory = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");
		System.out.println("*******Container started*******\n");

		System.out.println("No of bean is :: " + factory.getBeanDefinitionCount());
		System.out.println("Bean id is :: " + Arrays.toString(factory.getBeanDefinitionNames()));

		System.out.println();
		
		WishMessageGenerator wmg = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println("Hash code value of wmg :: " + wmg.hashCode());
		System.out.println(wmg);

		System.out.println();

		WishMessageGenerator wishMessageGenerator = factory.getBean("wishMessageGenerator", WishMessageGenerator.class);
		System.out.println("Hash code value of wishMessageGenerator :: " + wishMessageGenerator.hashCode());
		System.out.println(wishMessageGenerator);

		((AbstractApplicationContext) factory).close();
		System.out.println("\n**********Container is closed********");

	}

}

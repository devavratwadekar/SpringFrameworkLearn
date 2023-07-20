package in.ineuron.test;

//23 March 2023
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.WishMessageGenerator;

public class TestApp {

	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");
		System.in.read();

		WishMessageGenerator wmg1 = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println(wmg1 + " Available at :: " + wmg1.hashCode());

		WishMessageGenerator wmg2 = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println(wmg2 + " Available at :: " + wmg2.hashCode());

		factory.close();

	}

}

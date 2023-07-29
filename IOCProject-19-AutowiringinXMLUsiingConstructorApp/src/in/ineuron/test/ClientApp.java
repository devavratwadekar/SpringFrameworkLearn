package in.ineuron.test;

//27 March 2023
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Flipkart;

public class ClientApp {
	public static void main(String[] args) throws Exception {
		ApplicationContext factory = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");

		Flipkart flipkart = factory.getBean(Flipkart.class);
		System.out.println(flipkart.doShopping(new String[] { "Apple", "Banana" }, new float[] { 120.0f, 90.0f }));

		((AbstractApplicationContext) factory).close();
	}
}

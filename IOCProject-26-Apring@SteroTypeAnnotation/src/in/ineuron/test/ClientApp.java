package in.ineuron.test;

import java.util.Arrays;

//28 March 2023
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Flipkart;

public class ClientApp {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		System.out.println("Bean ids is :: " + Arrays.toString(context.getBeanDefinitionNames()));

		System.in.read();

		Flipkart flipkart = context.getBean("flipkart", Flipkart.class);
		System.out.println(flipkart.doShopping(new String[] { "Apple", "Banana" }, new float[] { 120.0f, 90.0f }));

		((AbstractApplicationContext) context).close();

	}
}

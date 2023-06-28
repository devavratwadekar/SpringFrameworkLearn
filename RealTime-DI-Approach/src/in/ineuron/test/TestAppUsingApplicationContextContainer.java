package in.ineuron.test;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Flipkart;

public class TestAppUsingApplicationContextContainer {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		System.out.println("*****Container Started*******\n");
		System.in.read();

		Flipkart flipkart = factory.getBean("fpkt", Flipkart.class);
		System.out.println(flipkart);

		System.out.println();
		String result = flipkart.doShopping(new String[] { "mango", "banana" }, new float[] { 123.43f, 234.54f });
		System.out.println(result);

		System.out.println("\n*****Container Stopped*******");
	}

}

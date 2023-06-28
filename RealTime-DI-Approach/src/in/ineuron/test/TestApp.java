package in.ineuron.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.comp.Flipkart;

public class TestApp {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");
		System.out.println("*****Container Started*******\n");

		Flipkart flipkart = factory.getBean("fpkt", Flipkart.class);
		System.out.println(flipkart);

		System.out.println();
		String result = flipkart.doShopping(new String[] { "mango", "banana" }, new float[] { 123.43f, 234.54f });
		System.out.println(result);

		System.out.println("\n*****Container Stopped*******");
	}

}

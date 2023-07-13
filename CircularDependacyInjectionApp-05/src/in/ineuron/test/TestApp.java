package in.ineuron.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.comp.A;
import in.ineuron.comp.B;

public class TestApp {

	public static void main(String[] args) throws Exception {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");
		System.out.println("*****Container Started*******\n");

		System.in.read();

		A aObj = factory.getBean("a1", A.class);
		
		System.out.println();

		B bObj = factory.getBean("b1", B.class);

		System.out.println("*****Container Stopped*******");
	}

}

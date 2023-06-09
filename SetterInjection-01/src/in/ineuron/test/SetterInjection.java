package in.ineuron.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.comp.WishMessageGenerator;

public class SetterInjection {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		FileSystemResource resource = new FileSystemResource("src/in/ineuron/cfg/applicationContext.xml");

		// Activating the IOC-container(XMLBeanFactory)
		System.out.println("Bean Factory container starting...");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		System.out.println("Bean Factory container started...");

		// Getting the bean from the container
		System.out.println();
		WishMessageGenerator generator = factory.getBean("wmg", WishMessageGenerator.class);

		System.out.println();
		System.out.println(generator);

		System.out.println();
		String result = generator.generateMessage("sachin");
		System.out.println(result);

		// Using the Bean
		System.out.println("**********Container is closed********");
		
		
		// Closing the container

	}

}

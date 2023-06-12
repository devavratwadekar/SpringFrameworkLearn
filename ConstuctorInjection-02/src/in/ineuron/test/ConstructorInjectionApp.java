package in.ineuron.test;

//21 March 2023
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.comp.WishMessageGenerator;

@SuppressWarnings("deprecation")
public class ConstructorInjectionApp {

	public static void main(String[] args) {

		FileSystemResource resource = new FileSystemResource("src/in/ineuron/cfg/applicationContext.xml");

		// Activating the IOC-container(XMLBeanFactory)
		System.out.println("**********Bean Factory container starting**********");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		System.out.println("**********Bean Factory container started**********");
		System.out.println();

		WishMessageGenerator wmg = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println(wmg);

		String result = wmg.generateMessage("Sachin");
		System.out.println(result);

		// Closing the container
		System.out.println("\n**********Container is closed********");

	}

}

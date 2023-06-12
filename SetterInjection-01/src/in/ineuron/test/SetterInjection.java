package in.ineuron.test;

//21 March 2023
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.comp.WishMessageGenerator;

@SuppressWarnings("deprecation")
public class SetterInjection {

	public static void main(String[] args) {

		FileSystemResource resource = new FileSystemResource("src/in/ineuron/cfg/applicationContext.xml");

		// Activating the IOC-container(XMLBeanFactory)
		System.out.println("Bean Factory container starting...");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		System.out.println("Bean Factory container started...");
		System.out.println();

		WishMessageGenerator wmg = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println("Hash code value of wmg :: " + wmg.hashCode());
		System.out.println(wmg);
		String result = wmg.generateMessage("sachin");
		System.out.println(result + "\n");

		WishMessageGenerator wmg1 = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println("Hash code value of wmg1 :: " + wmg1.hashCode());
		System.out.println(wmg1);
		String result1 = wmg1.generateMessage("kohli");
		System.out.println(result1 + "\n");

		// Closing the container
		System.out.println("**********Container is closed********");

	}

}

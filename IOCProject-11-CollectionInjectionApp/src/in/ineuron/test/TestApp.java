package in.ineuron.test;
import java.util.Arrays;

//24 March 2023
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.College;
import in.ineuron.comp.ContactInfo;
import in.ineuron.comp.MarksInfo;
import in.ineuron.comp.UniversityInfo;

public class TestApp {

	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");
		System.out.println("\n********Contsiner Started********");
		System.out.println("Bean Id is :: " + Arrays.toString(factory.getBeanDefinitionNames()));

		System.in.read();

		System.out.println();

		// Array
		MarksInfo info = factory.getBean("marks", MarksInfo.class);
		System.out.println(info);

		// List
		College college = factory.getBean("clg", College.class);
		System.out.println(college);

		// Set
		ContactInfo contactInfo = factory.getBean("contact", ContactInfo.class);
		System.out.println(contactInfo);

		// Map
		UniversityInfo universityInfo = factory.getBean("uInfo", UniversityInfo.class);
		System.out.println(universityInfo);

		factory.close();
		System.out.println("\n********Contsiner Stopped********");
	}

}

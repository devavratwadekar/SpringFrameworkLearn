package in.ineuron.test;

//23 March 2023
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Printer;

public class TestApp {

	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");
		System.out.println("********Contsiner Started********");
		System.in.read();

		Printer p1 = factory.getBean("printer", Printer.class);
		System.out.println(p1);

		Printer p2 = factory.getBean("printer", Printer.class);
		System.out.println(p2);

		factory.close();
		System.out.println("\n********Contsiner Stopped********");
	}

}

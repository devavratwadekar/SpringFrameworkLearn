package in.ineuron.test;

import java.util.Arrays;

//29 March 2023
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Voter;

public class ClientApp {

	public static void main(String[] args) throws Exception {

		System.out.println("*****Container Started*****\n");
		ApplicationContext context = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		System.out.println("Bean ids is :: " + Arrays.toString(context.getBeanDefinitionNames()));
		
		Voter voter = context.getBean(Voter.class);
		System.out.println(voter.checkEligibility());

		((AbstractApplicationContext) context).close();
		System.out.println("\n*****Container Stopped*****");

	}
}

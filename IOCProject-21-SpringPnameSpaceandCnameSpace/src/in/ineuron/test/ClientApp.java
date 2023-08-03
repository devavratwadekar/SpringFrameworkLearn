package in.ineuron.test;

//28 March 2023
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.Employee;

public class ClientApp {
	public static void main(String[] args) throws Exception {
		// Both Container(BeanFactory, ApplicationContext) supports P-namespace,C-namespace based programming.
		ApplicationContext context = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");

		Employee employee = context.getBean(Employee.class);
		System.out.println(employee);

		((AbstractApplicationContext) context).close();
	}
}

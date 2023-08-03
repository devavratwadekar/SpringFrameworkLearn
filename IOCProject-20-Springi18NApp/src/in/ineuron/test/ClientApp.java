package in.ineuron.test;

import java.util.Locale;

//27 March 2023
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");

		Locale locale = new Locale("hi", "IN");
		System.out.println(context.getMessage("btn1.cap", null, locale));
		System.out.println(context.getMessage("btn2.cap", null, locale));

		System.out.println();

		System.out.println(context.getMessage("btn1.cap", new String[] { "Students" }, locale));
		System.out.println(context.getMessage("btn1.cap", new String[] { "Teachers" }, locale));

		((AbstractApplicationContext) context).close();
	}
}

package in.ineuron.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.ineuron.cfg.AppConfig;
import in.ineuron.controller.MainController;

public class TestApp {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		MainController controller = context.getBean(MainController.class);
		System.out.println(controller);

		((AbstractApplicationContext) context).close();

	}
}

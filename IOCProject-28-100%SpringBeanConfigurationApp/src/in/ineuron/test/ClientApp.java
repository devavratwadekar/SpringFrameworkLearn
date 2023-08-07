package in.ineuron.test;

import java.util.Arrays;

//29 March 2023
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.ineuron.cfg.AppConfig;
import in.ineuron.comp.WishMessageGenerator;

public class ClientApp {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Bean ids is :: " + Arrays.toString(context.getBeanDefinitionNames()));
		System.out.println("*****Container Started*****\n");
		
		WishMessageGenerator wmg = context.getBean(WishMessageGenerator.class);
		System.out.println(wmg);
		System.out.println(wmg.generateWishMessage("Subodh"));

		((AbstractApplicationContext) context).close();
		System.out.println("\n*****Container Stopped*****");

	}
}

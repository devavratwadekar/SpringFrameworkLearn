package in.ineuron.test;

//21 March 2023
import java.util.Date;

import in.ineuron.comp.WishMessageGenerator;

public class UsingCoreJava {

	public static void main(String[] args) {

		WishMessageGenerator generator = new WishMessageGenerator();
		System.out.println("Target Object before Setter Injection :: " + generator);

		Date date = new Date();
		System.out.println("Defendent Object is :: " + date);

		generator.setDate(date);
		System.out.println("Target Object after Setter Injection :: " + generator);
		System.out.println();

		String result = generator.generateMessage("Subodh");
		System.out.println(result);

	}

}

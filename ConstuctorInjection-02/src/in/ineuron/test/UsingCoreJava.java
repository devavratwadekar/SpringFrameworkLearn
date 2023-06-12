package in.ineuron.test;

//21 March 2023
import java.util.Date;

import in.ineuron.comp.WishMessageGenerator;

public class UsingCoreJava {

	public static void main(String[] args) {
		Date date = new java.util.Date();
		System.out.println("Create an Object of Dependent class using Zero param constructor :: " + date);
		System.out.println();

		WishMessageGenerator wmg = new WishMessageGenerator(date);
		System.out.println("Create an Object of Target class using One parameterized constructor :: " + wmg);

		String result = wmg.generateMessage("Sachin");
		System.out.println(result);
	}

}

package in.ineuron.comp;

import java.util.Date;

//JDK supplier annotation
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component(value = "voter")
@PropertySource(value = "in/ineuron/commons/application.properties")
public class Voter {

	@Value("${voter.info.name}")
	private String name;

	@Value("${voter.info.age}")
	private Integer age;

	private Date dov;

	static {
		System.out.println("Voter.class file is loading...");
	}

	public Voter() {
		System.out.println("Voter object is instantiated....");
		System.out.println(this);
	}

	@PostConstruct
	public void myInit() {
		System.out.println("Voter.myInit()");
		dov = new Date();
		boolean flag = false;

		if (name == null) {
			System.out.println("Name must not be null");
			flag = true;
		}

		if (age < 0)
			age = age * -1;

		if (age > 100) {
			System.out.println("Age must not ne >100");
			flag = true;
		}

		if (flag)
			throw new IllegalArgumentException("Invalid inputs....");
	}

	// Business Logic
	public String checkEligibility() {
		System.out.println("Voter.checkEligibility()");

		if (age >= 18)
			return "Mr/Miss/Mrs " + name + " u r eligible for voting :: " + age;
		else
			return "Mr/Miss/Mrs " + name + " u r not eligible for voting :: " + age;
	}

	@PreDestroy
	public void myDestroy() {
		System.out.println("Voter.myDestroy()");

		// nullify the bean properties
		name = null;
		age = 0;
		dov = null;
	}

	@Override
	public String toString() {
		return "Voter [name=" + name + ", age=" + age + ", dov=" + dov + "]";
	}

}

package in.ineuron.comp;

//23 March 2023
import java.util.Date;

//Target class(user define=>WishMessageGenerator)
public class WishMessageGenerator {

	// Dependent class (predefined class=>java.util.Date)
	Date date;

	static {
		System.out.println("WishMessageGenerator.class file is loading...");
	}

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator object is initialized :: Zero param constructor");
	}

	public void setDate(Date date) {
		this.date = date;
		System.out.println("Setter method is called to perform Setter Injection...");
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}

}

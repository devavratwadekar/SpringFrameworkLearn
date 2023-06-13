package in.ineuron.comp;

//21 March 2023
import java.util.Date;

//Target class(user define=>WishMessageGenerator)
public class WishMessageGenerator {

	// Defendant class (predefined class=>java.util.Date)
	Date date;

	static {
		System.out.println("WishMessageGenerator.class file is loading...");
	}

	public WishMessageGenerator() {
		System.out.println("\nWishMessageGenerator object is initialized :: Zero param constructor");
	}

	public WishMessageGenerator(Date date) {
		this.date = date;
		System.out.println("\nWishMessageGenerator object is instantiated :: One param constructor");
		System.out.println(this);
	}

	public void setDate(Date date) {
		this.date = date;
		System.out.println("\nSetter method is called to perform Setter Injection...");
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}

}

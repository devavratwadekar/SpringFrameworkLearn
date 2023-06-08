package in.ineuron.comp;

import java.util.Date;

//Target class(user define=>WishMessageGenerator)
public class WishMessageGenerator {

	// Defendant class (predefined class=>java.util.Date)
	Date date;

	static {
		System.out.println("WishMessageGenerator.class file is loading...");
	}

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator object is initialized...");
	}

	public void setDate(Date date) {
		this.date = date;
		System.out.println("Setter method is called to perform Setter Injection...");
	}

	//Business logic
	@SuppressWarnings("deprecation")
	public String generateMessage(String name) {
		int hour = date.getHours(); // get in 24hours

		if (hour < 12)
			return "Good Morning :: " + name;
		else if (hour < 16)
			return "Good Afternoon :: " + name;
		else if (hour < 20)
			return "Good Evening :: " + name;
		else
			return "Good Night :: " + name;
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}

}

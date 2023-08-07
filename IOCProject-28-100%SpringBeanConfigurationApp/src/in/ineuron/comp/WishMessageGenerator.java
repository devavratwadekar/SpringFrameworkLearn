package in.ineuron.comp;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "wmg")
@Scope(scopeName = "singleton")
public class WishMessageGenerator {

	@Autowired(required = true)
	private LocalDateTime date;

	static {
		System.out.println("WishMessageGenerator.class file is loading...");
	}

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator obj is instantiated....");
	}

	public String generateWishMessage(String userName) {
		System.out.println("WishMessageGenerator.generateWishMessage()");
		int hours = date.getHour();

		if (hours < 12) {
			return "Good Morning :: " + userName;
		} else if (hours < 16) {
			return "Good Afternoon :: " + userName;
		} else if (hours < 20) {
			return "Good Evening :: " + userName;
		}
		return "Good Night :: " + userName;
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}

}

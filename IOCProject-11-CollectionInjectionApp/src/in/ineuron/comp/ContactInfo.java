package in.ineuron.comp;

import java.util.Date;
import java.util.Set;

public class ContactInfo {
	private Set<Long> phoneNumber;
	private Set<Date> dates;

	public void setPhoneNumber(Set<Long> phoneNumber) {
		this.phoneNumber = phoneNumber;
		System.out.println("Implementation class of Set is :: " + phoneNumber.getClass().getName());
	}

	public void setDates(Set<Date> dates) {
		this.dates = dates;
	}

	@Override
	public String toString() {
		return "ContactInfo [phoneNumber=" + phoneNumber + ", dates=" + dates + "]";
	}

}

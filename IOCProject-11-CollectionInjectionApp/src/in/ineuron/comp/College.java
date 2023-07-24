package in.ineuron.comp;

import java.util.Date;
import java.util.List;

//24 march 2023
public class College {
	private List<String> studName;
	private List<Date> listDate;

	public void setStudName(List<String> studName) {
		this.studName = studName;
		System.out.println("Implementation classname is :: " + studName.getClass().getName());
	}

	public void setListDate(List<Date> listDate) {
		this.listDate = listDate;
	}

	@Override
	public String toString() {
		return "College [studName=" + studName + ", listDate=" + listDate + "]";
	}

}

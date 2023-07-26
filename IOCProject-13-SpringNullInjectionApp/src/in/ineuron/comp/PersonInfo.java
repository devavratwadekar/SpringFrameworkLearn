package in.ineuron.comp;

import java.util.Date;

//24 March 2023
public class PersonInfo {
	private Integer pid;
	private String pname;
	private String paddress;
	private Date doj;
	private Date dom;
	private Date dob;

	public PersonInfo(Integer pid, String pname, String paddress, Date doj, Date dom, Date dob) {
		System.out.println("PersonInfo :: 6 param constructor...");
		this.pid = pid;
		this.pname = pname;
		this.paddress = paddress;
		this.doj = doj;
		this.dom = dom;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", pname=" + pname + ", paddress=" + paddress + ", doj=" + doj + ", dom="
				+ dom + ", dob=" + dob + "]";
	}

}

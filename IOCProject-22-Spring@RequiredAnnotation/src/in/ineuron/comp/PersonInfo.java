package in.ineuron.comp;

import org.springframework.beans.factory.annotation.Required;

@SuppressWarnings("deprecation")
public class PersonInfo {
	private Integer pid;
	private String pname;
	private String paddress;

	static {
		System.out.println("PersonInfo.class file is loading");
	}

	public PersonInfo() {
		System.out.println("PersonInfo :: Zero param constructor");
	}

	@Required
	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getPid() {
		return pid;
	}

	@Required
	public String getPname() {
		return pname;
	}

	public String getPaddress() {
		return paddress;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}

	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", pname=" + pname + ", paddress=" + paddress + "]";
	}

}

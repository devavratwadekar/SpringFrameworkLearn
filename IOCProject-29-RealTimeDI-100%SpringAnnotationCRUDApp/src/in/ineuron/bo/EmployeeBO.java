package in.ineuron.bo;

public class EmployeeBO {
	private Integer eid;
	private String ename;
	private Integer eage;
	private String eaddress;
	private Float esalary;
	private Float hikeAMount;

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Integer getEage() {
		return eage;
	}

	public void setEage(Integer eage) {
		this.eage = eage;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public Float getEsalary() {
		return esalary;
	}

	public void setEsalary(Float esalary) {
		this.esalary = esalary;
	}

	public Float getHikeAMount() {
		return hikeAMount;
	}

	public void setHikeAMount(Float hikeAMount) {
		this.hikeAMount = hikeAMount;
	}

	@Override
	public String toString() {
		return "EmployeeBO [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", eaddress=" + eaddress
				+ ", esalary=" + esalary + ", hikeAMount=" + hikeAMount + "]";
	}

}

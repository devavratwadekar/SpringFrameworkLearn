package in.ineuron.bo;

//BO => Business Object
public class CustomerBO {
	private String customerName;
	private String curtomerAddress;

	private Float pamt;
	private Float rate;
	private Float time;

	private Float intrAmount;

	static {
		System.out.println("CustomerBO.class file is loading...");
	}

	public CustomerBO() {
		System.out.println("CustomerBO object is instantiated...");
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCurtomerAddress() {
		return curtomerAddress;
	}

	public Float getPamt() {
		return pamt;
	}

	public Float getRate() {
		return rate;
	}

	public Float getTime() {
		return time;
	}

	public Float getIntrAmount() {
		return intrAmount;
	}

	public void setCurtomerAddress(String curtomerAddress) {
		this.curtomerAddress = curtomerAddress;
	}

	public void setPamt(Float pamt) {
		this.pamt = pamt;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}

	public void setTime(Float time) {
		this.time = time;
	}

	public void setIntrAmount(Float intrAmount) {
		this.intrAmount = intrAmount;
	}

	@Override
	public String toString() {
		return "CustomerBO [customerName=" + customerName + ", curtomerAddress=" + curtomerAddress + ", pamt=" + pamt
				+ ", rate=" + rate + ", time=" + time + ", intrAmount=" + intrAmount + "]";
	}

}

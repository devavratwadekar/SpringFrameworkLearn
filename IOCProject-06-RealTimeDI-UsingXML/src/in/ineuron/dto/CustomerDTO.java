package in.ineuron.dto;

//DTO => Data Transfer Object
public class CustomerDTO {
	private String customerName;
	private String curtomerAddress;

	private Float pamt;
	private Float rate;
	private Float time;

	static {
		System.out.println("CutomerDTO.class file is loading...");
	}

	public CustomerDTO() {
		System.out.println("CutomerDTO object is instantiated...");
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCurtomerAddress() {
		return curtomerAddress;
	}

	public void setCurtomerAddress(String curtomerAddress) {
		this.curtomerAddress = curtomerAddress;
	}

	public Float getPamt() {
		return pamt;
	}

	public void setPamt(Float pamt) {
		this.pamt = pamt;
	}

	public Float getRate() {
		return rate;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}

	public Float getTime() {
		return time;
	}

	public void setTime(Float time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "CutomerDTO [customerName=" + customerName + ", curtomerAddress=" + curtomerAddress + ", pamt=" + pamt
				+ ", rate=" + rate + ", time=" + time + "]";
	}

}

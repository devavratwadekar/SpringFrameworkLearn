package in.ineuron.comp;

public class Car {

	private String regNo;
	private String engineNo;
	private String model;
	private String company;
	private String type;
	private int engineCC;
	private String color;
	private String owner;
	private String fuelType;

	static {
		System.out.println("Car.class file is created...");
	}

	public Car() {
		System.out.println("Car Object is inastantiated....");
	}

	public Car(String regNo, String engineNo, String model, String company, String type, int engineCC, String color,
			String owner, String fuelType) {
		System.out.println("Car :: 6 param constructor");
		this.regNo = regNo;
		this.engineNo = engineNo;
		this.model = model;
		this.company = company;
		this.type = type;
		this.engineCC = engineCC;
		this.color = color;
		this.owner = owner;
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Car [regNo=" + regNo + ", engineNo=" + engineNo + ", model=" + model + ", company=" + company
				+ ", type=" + type + ", engineCC=" + engineCC + ", color=" + color + ", owner=" + owner + ", fuelType="
				+ fuelType + "]";
	}

}

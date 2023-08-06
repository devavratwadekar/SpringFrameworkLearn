package in.ineuron.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "in/ineuron/commons/application.properties")
public class Flipkart {

	@Autowired
	@Qualifier("dtdc")
	private Courier courier;
	
	@Value("${flipkart.info.discount}")
	private Float discount;

	static {
		System.out.println("\nFlipkart.class is loading..");
	}

	public Flipkart() {
		System.out.println("Flipkart :: zero param constuctor");
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
		System.out.println("Flipkart.setCourier()");
		System.out.println(this);
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
		System.out.println("Flipkart.setDiscount()");
	}

	// Business logic
	public String doShopping(String[] items, float[] prices) {
		System.out.println("Flipkart.doShopping()");
		System.out.println("Implementation class is :: " + courier.getClass().getName());
		System.out.println("Discount amount is :: " + discount);

		int oid = 0;
		float billAmout = 0.0f;
		Random random = null;

		for (float price : prices) {
			billAmout += price;
		}
		billAmout = billAmout - (discount / 100.0f);
		System.out.println("Bill Amount is :: " + billAmout);

		random = new Random();
		oid = random.nextInt(1000);
		System.out.println("Order id is :: " + oid);
		String msg = courier.deliver(oid);

		return Arrays.toString(items) + "are purchased having price " + Arrays.toString(prices) + "with billAmount of "
				+ billAmout + "------>" + msg;
	}

	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + ", discount=" + discount + "]";
	}

}

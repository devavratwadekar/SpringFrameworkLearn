package in.ineuron.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Flipkart {

	private Courier courier;
	private Float discount;

	static {
		System.out.println("\nFlipkart.class is loading..");
	}

	public Flipkart() {
		System.out.println("Flipkart :: zero param constuctor");
	}

	@Autowired
	public Flipkart(@Qualifier("dtdc") Courier courier, Float discount) {
		this.courier = courier;
		this.discount = discount;
		System.out.println("Flipkart :: Two param constructor...");
		System.out.println(this);
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

		return Arrays.toString(items) + " are purchased having price " + Arrays.toString(prices) + "\n with billAmount of "
				+ billAmout + "\n " + msg;
	}

	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + ", discount=" + discount + "]";
	}

}

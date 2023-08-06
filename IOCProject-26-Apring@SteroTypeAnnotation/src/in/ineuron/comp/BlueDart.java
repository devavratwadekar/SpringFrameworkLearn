package in.ineuron.comp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "bDart")
@Scope(scopeName = "singleton")
public class BlueDart implements Courier {

	static {
		System.out.println("BlueDart.class file is loading...");
	}

	public BlueDart() {
		System.out.println("BlueDart:: Zero param constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("BlueDart.deliver()");
		return "BlueDart Courier will be delived with the order id :: " + oid + " for the order products";
	}

}

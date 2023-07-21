package in.ineuron.comp;

//23 March 2023
public class Printer {
	private static Printer INSTANCE = null;

	private Printer() {
		// OUTSIDE does't not create OBJECT
	}

	static {
		System.out.println("Printer.class file is loading");
	}

	public static Printer getInstance() {
		System.out.println("Printer.getInstance()");
		if (INSTANCE == null) {
			INSTANCE = new Printer();
		}
		return INSTANCE;
	}

	@Override
	public String toString() {
		return "Printer [hashCode()=" + hashCode() + "]";
	}

}

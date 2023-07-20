package in.ineuron.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.controller.MainController;
import in.ineuron.vo.CustomerVO;

public class TestApp {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the CustomerName :: ");
		String customerName = scanner.next();

		System.out.print("Enter the CustomerAddress :: ");
		String customerAddress = scanner.next();

		System.out.print("Enter the PrincipalAmount :: ");
		String pamt = scanner.next();

		System.out.print("Enter the RateOfInterset :: ");
		String rate = scanner.next();

		System.out.print("Enter the TimePeriod :: ");
		String time = scanner.next();

		CustomerVO customerVO = new CustomerVO();
		customerVO.setCustomerName(customerName);
		customerVO.setCustomerAddress(customerAddress);
		customerVO.setPamt(pamt);
		customerVO.setRate(rate);
		customerVO.setTime(time);

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");
		System.out.println("\n******Container Started*******");

		MainController controller = factory.getBean("customerController", MainController.class);
		try {
			String result = controller.processCustomer(customerVO);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Internal Problem....Try Again." + e.getMessage());
		}

		System.out.println("\n******Container Stopped*******");
		scanner.close();
	}

}

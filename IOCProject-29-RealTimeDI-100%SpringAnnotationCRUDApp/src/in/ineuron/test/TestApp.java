package in.ineuron.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.ineuron.cfg.AppConfig;
import in.ineuron.controller.MainController;
import in.ineuron.vo.EmployeeVO;

public class TestApp {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Employee Name :: ");
		String ename = scanner.next();

		System.out.println("Enter Employee Age :: ");
		String eage = scanner.next();

		System.out.println("Enter Employee Address :: ");
		String eaddress = scanner.next();

		System.out.println("Enter Employee Salary :: ");
		String esalary = scanner.next();

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// send
		MainController controller = context.getBean(MainController.class);
		EmployeeVO employeeVO = new EmployeeVO();
		employeeVO.setEname(ename);
		employeeVO.setEage(eage);
		employeeVO.setEaddress(eaddress);
		employeeVO.setEsalary(esalary);

		EmployeeVO voResult = controller.getHike(employeeVO);
		System.out.println(voResult);

		((AbstractApplicationContext) context).close();
		scanner.close();

	}
}

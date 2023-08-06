package in.ineuron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.ineuron.dto.CustomerDTO;
import in.ineuron.service.ICutomerMgmntService;
import in.ineuron.vo.CustomerVO;

@Component(value = "controller")
public class MainController {

	@Autowired
	private ICutomerMgmntService service;

	static {
		System.out.println("MainController.class file is loading...");
	}

	public MainController() {
		System.out.println("MainController :: Zero param constructor...");
	}

	public String processCustomer(CustomerVO vo) throws Exception {

		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setCustomerName(vo.getCustomerName());
		customerDTO.setCurtomerAddress(vo.getCustomerAddress());
		customerDTO.setPamt(Float.parseFloat(vo.getPamt()));
		customerDTO.setRate(Float.parseFloat(vo.getRate()));
		customerDTO.setTime(Float.parseFloat(vo.getTime()));

		String result = service.claculateSimpleInterest(customerDTO);

		return result;
	}
}

package in.ineuron.controller;

import in.ineuron.dto.CustomerDTO;
import in.ineuron.service.ICutomerMgmntService;
import in.ineuron.vo.CustomerVO;

public class MainController {

	private ICutomerMgmntService service;

	public MainController(ICutomerMgmntService service) {
		this.service = service;
		System.out.println("MainController           :: 1 param constructo  ---> " + service.getClass().getName());
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

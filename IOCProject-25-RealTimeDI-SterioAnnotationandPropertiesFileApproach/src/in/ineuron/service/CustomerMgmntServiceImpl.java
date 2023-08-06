package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.bo.CustomerBO;
import in.ineuron.dao.ICustomerDAO;
import in.ineuron.dto.CustomerDTO;

@Service(value = "service")
public class CustomerMgmntServiceImpl implements ICutomerMgmntService {

	@Autowired
	private ICustomerDAO dao;

	static {
		System.out.println("CustomerMgmntServiceImplr.class file is loading...");
	}

	public CustomerMgmntServiceImpl() {
		System.out.println("CustomerMgmntServiceImpl :: Zero param constructor...");
	}

	@Override
	public String claculateSimpleInterest(CustomerDTO dto) throws Exception {
		float intrAmount = (dto.getPamt() * dto.getRate() * dto.getTime()) / 100.0f;

		CustomerBO customerBO = new CustomerBO();
		customerBO.setCustomerName(dto.getCustomerName());
		customerBO.setCurtomerAddress(dto.getCurtomerAddress());
		customerBO.setPamt(dto.getPamt());
		customerBO.setRate(dto.getRate());
		customerBO.setTime(dto.getTime());

		customerBO.setIntrAmount(intrAmount);

		int count = dao.save(customerBO);

		return count == 0 ? "Customer Restration Failed "
				: "Customer Restration Successfull ---> SimpleInterestAmount :: " + intrAmount;
	}
}

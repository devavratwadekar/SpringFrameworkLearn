package in.ineuron.service;

import in.ineuron.bo.CustomerBO;
import in.ineuron.dao.ICustomerDAO;
import in.ineuron.dto.CustomerDTO;

public class CustomerMgmntServiceImpl implements ICutomerMgmntService {

	private ICustomerDAO dao;

	public CustomerMgmntServiceImpl(ICustomerDAO dao) {
		this.dao = dao;
		System.out.println("CustomerMgmntServiceImpl :: 1 param constructor ---> " + dao.getClass().getName());
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

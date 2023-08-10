package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.dao.IEmployeeDAO;
import in.ineuron.dto.EmployeeDTO;
import in.ineuron.vo.EmployeeVO;

@Service(value = "empService")
public class EmployeeServiceImpl implements IEmployeeService {

	static {
		System.out.println("EmployeeServiceImpl.class file is loading...");
	}

	public EmployeeServiceImpl() {
		System.out.println("EmployeeServiceImpl :: Zero param constructor...");
	}

	@Autowired
	IEmployeeDAO dao;

	@Override
	public EmployeeVO calculateHike(EmployeeDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "EmployeeServiceImpl [dao=" + dao + "]";
	}

}

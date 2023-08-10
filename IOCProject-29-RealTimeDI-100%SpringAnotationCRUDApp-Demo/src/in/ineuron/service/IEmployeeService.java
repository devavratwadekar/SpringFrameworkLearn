package in.ineuron.service;

import in.ineuron.dto.EmployeeDTO;
import in.ineuron.vo.EmployeeVO;

public interface IEmployeeService {
	public EmployeeVO calculateHike(EmployeeDTO dto);
}

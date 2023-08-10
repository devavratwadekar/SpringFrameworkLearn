package in.ineuron.dao;

import in.ineuron.bo.EmployeeBO;
import in.ineuron.dto.EmployeeDTO;

public interface IEmployeeDAO {

	public EmployeeDTO save(EmployeeBO bo);

}

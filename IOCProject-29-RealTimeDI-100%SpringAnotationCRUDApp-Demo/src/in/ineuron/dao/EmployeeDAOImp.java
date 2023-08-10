package in.ineuron.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zaxxer.hikari.HikariDataSource;

import in.ineuron.bo.EmployeeBO;
import in.ineuron.dto.EmployeeDTO;

@Repository(value = "dao")
public class EmployeeDAOImp implements IEmployeeDAO {

	static {
		System.out.println("EmployeeDAOImp.class file is loading...");
	}

	public EmployeeDAOImp() {
		System.out.println("EmployeeDAOImp :: Zero param constructor...");
	}

	@Autowired
	private HikariDataSource dataSource;

	@Override
	public EmployeeDTO save(EmployeeBO bo) {
		return null;
	}

	@Override
	public String toString() {
		return "EmployeeDAOImp [dataSource=" + dataSource + "]";
	}

}

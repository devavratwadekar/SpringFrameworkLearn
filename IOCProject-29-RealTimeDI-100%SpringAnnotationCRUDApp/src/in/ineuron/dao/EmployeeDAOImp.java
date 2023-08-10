package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zaxxer.hikari.HikariDataSource;

import in.ineuron.bo.EmployeeBO;

@Repository(value = "dao")
public class EmployeeDAOImp implements IEmployeeDAO {

	private static final String SQL_INSERT_QUERY = "";

	static {
		System.out.println("EmployeeDAOImp.class file is loading...");
	}

	public EmployeeDAOImp() {
		System.out.println("EmployeeDAOImp :: Zero param constructor...");
	}

	@Autowired
	private HikariDataSource dataSource;

	@Override
	public EmployeeBO save(EmployeeBO bo) {

		try (Connection connection = dataSource.getConnection();
				PreparedStatement pstmt = connection.prepareStatement(SQL_INSERT_QUERY)) {
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public String toString() {
		return "EmployeeDAOImp [dataSource=" + dataSource + "]";
	}

}

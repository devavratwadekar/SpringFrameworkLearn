package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.ineuron.bo.CustomerBO;

@Repository(value = "dao")
public class CustomerMySQLDAOImpl implements ICustomerDAO {

	private static final String REAL_CUSTOMER_INSERT_QUERY = "insert into customer(`cname`,`caddress`,`pamt`,`rate`,`time`,`intrAmount`) values(?,?,?,?,?,?)";
	
	@Autowired
	private DataSource dataSource;
	
	static {
		System.out.println("CustomerMySQLDAOImpl.class file is loading...");
	}

	public CustomerMySQLDAOImpl() {
		System.out.println("CustomerMySQLDAOImpl :: Zero param constructor...");
	}

	@Override
	public int save(CustomerBO bo) throws Exception {

		int count = 0;

		try (Connection connection = dataSource.getConnection();
				PreparedStatement pstmt = connection.prepareStatement(REAL_CUSTOMER_INSERT_QUERY);) {
			pstmt.setString(1, bo.getCustomerName());
			pstmt.setString(2, bo.getCurtomerAddress());
			pstmt.setFloat(3, bo.getPamt());
			pstmt.setFloat(4, bo.getRate());
			pstmt.setFloat(5, bo.getTime());
			pstmt.setFloat(6, bo.getIntrAmount());

			count = pstmt.executeUpdate();

		} catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return count;
	}

	@Override
	public String toString() {
		return "CustomerMySQLDAOImpl [dataSource=" + dataSource + "]";
	}

}

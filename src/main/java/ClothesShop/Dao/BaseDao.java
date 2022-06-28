package ClothesShop.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class BaseDao {
//	khai báo lớp jdbc template
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	
	
}

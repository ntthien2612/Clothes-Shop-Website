package ClothesShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class MapperUsers implements RowMapper<Users>{
	
	public Users mapRow(ResultSet rs, int rowNum) throws SQLException{
		Users user = new Users();
		user.setId_kh(rs.getLong("id_kh"));
		user.setTen_kh(rs.getString("ten_kh"));
		user.setPass(rs.getString("pass"));
		user.setDiachi(rs.getString("diachi"));
		user.setEmail_kh(rs.getString("email_kh"));
		return user;
	}
}

package ClothesShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class MapperUsers implements RowMapper<Users>{
	
	public Users mapRow(ResultSet rs, int rowNum) throws SQLException{
		Users user = new Users();
<<<<<<< HEAD
		user.setId_kh(rs.getInt("id_kh"));
		user.setTen_kh(rs.getString("ten_kh"));
		user.setPass(rs.getString("pass"));
		user.setEmail_kh(rs.getString("email_kh"));
		user.setDiachi(rs.getString("diachi"));
		user.setSdt(rs.getString("sdt"));
=======
		user.setId_kh(rs.getLong("id_kh"));
		user.setTen_kh(rs.getString("ten_kh"));
		user.setPass(rs.getString("pass"));
		user.setDiachi(rs.getString("diachi"));
		user.setEmail_kh(rs.getString("email_kh"));
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
		return user;
	}
}

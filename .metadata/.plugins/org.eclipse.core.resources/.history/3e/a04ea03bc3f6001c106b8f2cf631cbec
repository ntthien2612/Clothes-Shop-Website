package ClothesShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperAdmin implements RowMapper<Admin> {
	
	public Admin mapRow(ResultSet rs, int rowNum)throws SQLException{
		Admin admin = new Admin();
		admin.setId_ad(rs.getLong("id_ad"));
		admin.setTaikhoan(rs.getString("taikhoan"));
		admin.setPass(rs.getString("pass"));
		admin.setHoten(rs.getString("hoten"));
		return admin;
	}
}


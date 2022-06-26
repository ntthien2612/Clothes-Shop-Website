package ClothesShop.Entity;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.RowMapper;

public class MapperDanhSachSanPham implements RowMapper<String[]>{

	public String[] mapRow(ResultSet rs, int rowNum) throws SQLException {
		String[] list = new String[7];
		list[0] = String.valueOf(rs.getInt("id_sp"));
		list[1] = String.valueOf(rs.getInt("sanpham.id_dm"));
		list[2] = rs.getString("ten_sp");
		list[3] = String.valueOf(rs.getInt("gia"));
		list[4] = rs.getString("hinhanh");
		list[5] = rs.getString("mota");
		list[6] = rs.getString("ten_dm");
		return list;
	}
	
}

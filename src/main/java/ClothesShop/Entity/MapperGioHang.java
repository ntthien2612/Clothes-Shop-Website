package ClothesShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperGioHang  implements RowMapper<String[]>{
	public String[] mapRow(ResultSet rs, int rowNum) throws SQLException {
		String[] list = new String[9];
		list[0] = rs.getString("id");
		list[1] = rs.getString("giohang.id_kh");
		list[2] = rs.getString("hinhanh");
		list[3] = rs.getString("ten_sp");
		list[4] = rs.getString("gia");
		list[5] = rs.getString("soluong_them");
		list[6] = String.valueOf(Integer.parseInt(list[4])*Integer.parseInt(list[5]));
		list[7] = rs.getString("id_sp");
		list[8] = rs.getString("size");
		return list;
	}
}

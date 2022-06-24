package ClothesShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperDanhMuc implements RowMapper<DanhMuc>{
	public DanhMuc mapRow(ResultSet rs, int rowNum) throws SQLException {
		DanhMuc danhmuc = new DanhMuc();
		danhmuc.setId_dm(rs.getInt("id_dm"));
		danhmuc.setTen_dm(rs.getString("ten_dm"));
		return danhmuc;
	}
}

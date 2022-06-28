package ClothesShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperChiTietSanPham implements RowMapper<ChiTietSanPham>{
	public ChiTietSanPham mapRow(ResultSet rs, int rowNum) throws SQLException {
		ChiTietSanPham chitiet = new ChiTietSanPham();
		chitiet.setId_sp(rs.getInt("id_sp"));
		chitiet.setSoluong(rs.getInt("soluong"));
		chitiet.setSize(rs.getString("size"));
		return chitiet;
	}
}

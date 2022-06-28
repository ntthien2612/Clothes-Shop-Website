package ClothesShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperSanPham implements RowMapper<SanPham>{

	public SanPham mapRow(ResultSet rs, int rowNum) throws SQLException {
		SanPham sanpham = new SanPham();
		sanpham.setId_sp(rs.getInt("id_sp"));
		sanpham.setId_dm(rs.getInt("id_dm"));
		sanpham.setTen_sp(rs.getString("ten_sp"));
		sanpham.setHinhanh(rs.getString("hinhanh"));
		sanpham.setGia(rs.getInt("gia"));
		sanpham.setMota(rs.getString("mota"));
		return sanpham;
	}
}



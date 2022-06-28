package ClothesShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperNguoiDung implements RowMapper<NguoiDung>{
	public NguoiDung mapRow(ResultSet rs, int rowNum) throws SQLException {
		NguoiDung nguoidung = new NguoiDung();
		nguoidung.setId_kh(rs.getInt("id_kh"));
		nguoidung.setTen_kh(rs.getString("ten_kh"));
		nguoidung.setEmail_kh(rs.getString("email_kh"));
		nguoidung.setPass(rs.getString("pass"));
		nguoidung.setDiachi(rs.getString("diachi"));
		nguoidung.setSdt(rs.getString("sdt"));
		nguoidung.setHinhanh(rs.getString("hinhanh"));
		return nguoidung;
	}
}

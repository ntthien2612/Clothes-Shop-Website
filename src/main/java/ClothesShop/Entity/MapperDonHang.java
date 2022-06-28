package ClothesShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperDonHang implements RowMapper<DonHang> {
	
		public DonHang mapRow(ResultSet rs, int rowNum) throws SQLException {
			DonHang donhang = new DonHang();
			donhang.setId_dh(rs.getInt("id_dh"));
			donhang.setId_kh(rs.getInt("id_kh"));
			donhang.setThoigian_mua(rs.getTimestamp("thoigian_mua"));
			donhang.setTongtien(rs.getInt("tongtien"));
			donhang.setTrangthai(rs.getString("trangthai"));
			donhang.setTen_kh(rs.getString("ten_kh"));
			donhang.setEmail_kh(rs.getString("email_kh"));
			donhang.setDiachi(rs.getString("diachi"));
			donhang.setSdt(rs.getString("sdt"));
			return donhang;
		}
	}


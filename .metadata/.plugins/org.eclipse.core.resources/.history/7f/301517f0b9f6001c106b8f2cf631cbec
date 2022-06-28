package ClothesShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Repository;

import ClothesShop.Entity.Admin;
import ClothesShop.Entity.MapperAdmin;
import ClothesShop.Entity.MapperUsers;
import ClothesShop.Entity.Users;

@Repository
public class UsersDao extends BaseDao {
	// them khach hang
	public int AddAccount(Users user) {
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT ");
		sql.append("INTO khachhang ");
		sql.append("( ");
		sql.append("	ten_kh, ");
		sql.append("	email_kh, ");
		sql.append("	pass, ");
		sql.append("	diachi, ");
		sql.append("	sdt ");
		sql.append(") ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("	'" + user.getTen_kh() + "', ");
		sql.append("	'" + user.getEmail_kh() + "', ");
		sql.append("	'" + user.getPass() + "', ");
		sql.append("	'" + user.getDiachi() + "', ");
		sql.append("	'" + user.getSdt() + "' ");
		sql.append(")");

		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}

	// dang nhap
	public Users GetUserByAcc(Users user) {

		try {
			String sql = "SELECT * FROM khachhang WHERE email_kh = '" + user.getEmail_kh() + "'";
			Users result = _jdbcTemplate.queryForObject(sql, new MapperUsers());
			return result;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

//	lấy thông tin khác hàng
	public List<Users> GetDataChiTietKhachHang(int id_kh) {
		List<Users> list_kh = new ArrayList<Users>();
		String sql_kh = "select * from khachhang where id_kh = " + id_kh;
		list_kh = _jdbcTemplate.query(sql_kh, new MapperUsers());
		return list_kh;
	}
	
// sửa thồn tin khác hàng

	public int ChinhSuaKhachHang(Users khachhang) {
		String sql = "update khachhang set ten_kh='" + khachhang.getTen_kh() + "',diachi='" + khachhang.getDiachi()
				+ "',sdt='" + khachhang.getSdt() + "'where id_kh=" + khachhang.getId_kh();
//		System.out.println(sql);
		int update = _jdbcTemplate.update(sql.toString());
		return update;
	}

	// kiem tra email trung
	public int Count(String email) {
		int count = 0;
		String sql = "SELECT COUNT(*) FROM khachhang where email_kh='" + email + "'";
		count = _jdbcTemplate.queryForObject(sql, Integer.class);
		return count;
	}
}

package ClothesShop.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;

import ClothesShop.Entity.DanhMuc;
import ClothesShop.Entity.GioHang;
import ClothesShop.Entity.MapperDanhMuc;
import ClothesShop.Entity.MapperGioHang;
import ClothesShop.Entity.Users;
@Repository
public class GioHangDao extends BaseDao{
	
//	public int Count(String email) {
//		int count = 0;
//		String sql = "SELECT COUNT(*) FROM khachhang where email_kh='" + email + "'";
//		count = _jdbcTemplate.queryForObject(sql, Integer.class);
//		return count;
//	}
	public int ThemGioHang(GioHang giohang) {
			String sql_sp="insert into giohang (id_kh, id_sp, size, soluong_them) values("+giohang.getId_kh()+","+giohang.getId_sp()+",'"+giohang.getSize()+"',"+giohang.getSoluong_them()+")";
			int list_sp = _jdbcTemplate.update(sql_sp.toString());
			return list_sp;
	}
//hien thi gio hang
	public List<GioHang> HienGioHang(int id_kh) {
		List<GioHang> list = new ArrayList<GioHang>();
		String sql = "select * from giohang where id_kh="+id_kh;
		list = _jdbcTemplate.query(sql, new MapperGioHang());
		return list;
	}
//cong so luong sp gio hang
	public int CongGioHang(int idsp, int idkh) {
		String sql = "update giohang set soluong_them=soluong_them+1 where id="+idsp;
		int list = _jdbcTemplate.update(sql.toString());
		return list;
	}
//tru so luong sp gio hang
	public int TruGioHang(int idsp, int idkh) {
		String sql = "update giohang set soluong_them=soluong_them-1 where id="+idsp;
		int list = _jdbcTemplate.update(sql.toString());
		return list;
	}
//xoa sp gio hang
	public int XoaGioHang(int id, int idkh) {
		String sql = "delete from giohang where id="+id;
		int list = _jdbcTemplate.update(sql.toString());
		return list;
	}
//dem so luong sp gio hang	
	public int Count(int id_kh) {
		int count=0;
		String sql = "SELECT COUNT(*) FROM giohang where id_kh="+id_kh;
		count = _jdbcTemplate.queryForObject(sql,Integer.class);
		return count;
	}
}

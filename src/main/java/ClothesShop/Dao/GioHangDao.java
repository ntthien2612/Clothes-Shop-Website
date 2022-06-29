package ClothesShop.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;

import ClothesShop.Entity.ChiTietSanPham;
import ClothesShop.Entity.DanhMuc;
import ClothesShop.Entity.GioHang;
import ClothesShop.Entity.MapperChiTietSanPham;
import ClothesShop.Entity.MapperDanhMuc;
import ClothesShop.Entity.MapperDanhSachSanPham;
import ClothesShop.Entity.MapperGioHang;
import ClothesShop.Entity.Users;

@Repository
public class GioHangDao extends BaseDao {
	public int ThemGioHang(GioHang giohang) {
		try {
			String sql_sp = "insert into giohang (id_kh, id_sp, size, soluong_them) values(" + giohang.getId_kh() + ","
					+ giohang.getId_sp() + ",'" + giohang.getSize() + "'," + giohang.getSoluong_them() + ")";
			int list_sp = _jdbcTemplate.update(sql_sp.toString());
			return list_sp;
		} catch (EmptyResultDataAccessException e) {
			return 0;
		}
	}

//hien thi gio hang
	public List<String[]> HienGioHang(int id_kh) {
		try {
			List<String[]> list = new ArrayList<String[]>();
			String sql = "select id, giohang.id_sp, ten_sp, id_kh, gia, hinhanh, size, soluong_them from giohang join sanpham where sanpham.id_sp=giohang.id_sp and  id_kh="
					+ id_kh;
			list = _jdbcTemplate.query(sql, new MapperGioHang());
			return list;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

//cong so luong sp gio hang
	public int CongGioHang(int idsp, int idkh) {
		try {
			String sql = "update giohang set soluong_them=soluong_them+1 where id=" + idsp;
			int list = _jdbcTemplate.update(sql.toString());
			return list;
		} catch (EmptyResultDataAccessException e) {
			return 0;
		}
	}

//tru so luong sp gio hang
	public int TruGioHang(int idsp, int idkh) {
		try {
			String sql = "update giohang set soluong_them=soluong_them-1 where id=" + idsp;
			int list = _jdbcTemplate.update(sql.toString());
			return list;
		} catch (EmptyResultDataAccessException e) {
			return 0;
		}
	}

//xoa sp gio hang
	public int XoaGioHang(int id, int idkh) {
		try {
			String sql = "delete from giohang where id=" + id;
			int list = _jdbcTemplate.update(sql.toString());
			return list;
		} catch (EmptyResultDataAccessException e) {
			return 0;
		}
	}

//dem so luong sp gio hang	
	public int Count(int id_kh) {
		try {
			int count = 0;
			String sql = "SELECT COUNT(*) FROM giohang where id_kh=" + id_kh;
			count = _jdbcTemplate.queryForObject(sql, Integer.class);
			return count;
		} catch (EmptyResultDataAccessException e) {
			return 0;
		}
	}

//kiem tra san pham co ton tai trong gio hang chua
	public int KiemTraGioHang(GioHang giohang) {
		try {
			List<String[]> list_sp = new ArrayList<String[]>();
			String sql = "select id, giohang.id_sp, ten_sp, id_kh, gia, hinhanh, size, soluong_them from giohang join sanpham where sanpham.id_sp=giohang.id_sp and  id_kh="
					+ giohang.getId_kh() + " and size='" + giohang.getSize() + "' and giohang.id_sp="
					+ giohang.getId_sp();
			list_sp = _jdbcTemplate.query(sql, new MapperGioHang());
			return list_sp.size();
		} catch (EmptyResultDataAccessException e) {
			return 0;
		}
	}

//san pham da ton tai thi update so luong
	public int UpdateGioHang(GioHang giohang) {
		try {
			String sql_sp = "update giohang set soluong_them=soluong_them+" + giohang.getSoluong_them()
					+ " where id_sp=" + giohang.getId_sp() + " and size='" + giohang.getSize() + "' and id_kh= '"
					+ giohang.getId_kh() + "'";
			int list_sp = _jdbcTemplate.update(sql_sp.toString());
			return list_sp;
		} catch (EmptyResultDataAccessException e) {
			return 0;
		}
	}

}

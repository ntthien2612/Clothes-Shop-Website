package ClothesShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ClothesShop.Entity.DanhMuc;
import ClothesShop.Entity.MapperDanhMuc;
import ClothesShop.Entity.MapperNguoiDung;
import ClothesShop.Entity.NguoiDung;
@Repository
public class NguoiDungDao extends BaseDao{
//hien danh sach khach hang
	public List<NguoiDung> GetDataKhachHang() {
		List<NguoiDung> list = new ArrayList<NguoiDung>();
		String sql = "select * from khachhang";
		list = _jdbcTemplate.query(sql, new MapperNguoiDung());
		return list;
	}
//tim kiem khach hang trang admin
	public List<NguoiDung> GetDataTimKiemNguoiDung(String tenkh) {
		List<NguoiDung> list = new ArrayList<NguoiDung>();
		String sql = "select * from khachhang where ten_kh LIKE '%" +tenkh+"%'";
		list = _jdbcTemplate.query(sql, new MapperNguoiDung());
		return list;
	}
}

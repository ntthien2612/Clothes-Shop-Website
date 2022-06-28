package ClothesShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ClothesShop.Entity.DanhMuc;
import ClothesShop.Entity.DonHang;
import ClothesShop.Entity.MapperChiTietDonHang;
import ClothesShop.Entity.MapperDonHang;

@Repository
public class DonHangDao extends BaseDao{
//hien danh sach don hang
	public List<DonHang> DanhSachDonHang() {
		List<DonHang> list = new ArrayList<DonHang>();
		String sql = "select * from donhang";
		list = _jdbcTemplate.query(sql, new MapperDonHang());
		return list;
	}
//chuc nang xac nhan don hang
	public int XacNhanDonHang(int don) {
		String sql_sp = "update donhang set trangthai='Đang giao' where id_dh="+don;
		int list_sp = _jdbcTemplate.update(sql_sp.toString());
		return list_sp;
	}
//chuc nang them nhat ky
	public int ThemNhatKy(int don) {
		String sql_sp="insert into nhatky (id_dh, thoigianupdate, trangthai) values("+don+",'"+java.time.LocalDateTime.now()+"',"+"'Đang giao')";
		int list_sp = _jdbcTemplate.update(sql_sp.toString());
		return list_sp;
	}
//lay chi tiet don hang
	public List<String[]> ChiTietDonHang(int don) {
		List<String[]> list = new ArrayList<String[]>();
		String sql = "select donhang.tongtien, donhang.id_dh, donhang.id_kh, sanpham.ten_sp, chitietdonhang.gia, sanpham.hinhanh, chitietdonhang.size, chitietdonhang.soluong, chitietdonhang.id_sp from donhang join chitietdonhang join sanpham where sanpham.id_sp=chitietdonhang.id_sp and donhang.id_dh=chitietdonhang.id_dh and  donhang.id_dh="+don;
		list = _jdbcTemplate.query(sql, new MapperChiTietDonHang());
		return list;
	}
//xem chi tiet
	public List<DonHang> DonHang(int don) {
		List<DonHang> list = new ArrayList<DonHang>();
		String sql = "select * from donhang where id_dh="+don;
		list = _jdbcTemplate.query(sql, new MapperDonHang());
		return list;
	}

}

package ClothesShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ClothesShop.Entity.ChiTietSanPham;
import ClothesShop.Entity.MapperChiTietSanPham;
import ClothesShop.Entity.MapperSanPham;
import ClothesShop.Entity.SanPham;

@Repository
public class SanPhamDao extends BaseDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;

//hien trang san pham
	public List<SanPham> GetDataSanPham() {
		List<SanPham> list_sp = new ArrayList<SanPham>();
		String sql_sp = "select * from sanpham";
		list_sp = _jdbcTemplate.query(sql_sp, new MapperSanPham());
		return list_sp;
	}

//hien thi san pham theo doanh muc
	public List<SanPham> GetDataSanPham(int id) {
		List<SanPham> list_sp = new ArrayList<SanPham>();
		String sql_sp = "select * from sanpham where id_dm = " + id;
		list_sp = _jdbcTemplate.query(sql_sp, new MapperSanPham());
		return list_sp;
	}
//tim kiem san pham theo ten
	public List<SanPham> GetDataSanPham(String noidung) {
		List<SanPham> list_sp = new ArrayList<SanPham>();
		String sql_sp = "select * from sanpham where ten_sp LIKE '%" +noidung+"%'";
		list_sp = _jdbcTemplate.query(sql_sp, new MapperSanPham());
		return list_sp;
	}

//hien trang chi tiet
	public List<SanPham> GetDataChiTiet(int id) {
		List<SanPham> list_sp = new ArrayList<SanPham>();
		String sql_sp = "select * from sanpham where id_sp=" + id;
		list_sp = _jdbcTemplate.query(sql_sp, new MapperSanPham());
		return list_sp;
	}

	public List<ChiTietSanPham> GetDataSizeChiTiet(int id) {
		List<ChiTietSanPham> list_sp = new ArrayList<ChiTietSanPham>();
		String sql_sp = "select * from chitietsanpham where id_sp=" + id;
		list_sp = _jdbcTemplate.query(sql_sp, new MapperChiTietSanPham());
		return list_sp;
	}

//them san pham
	public int AddSanPham(SanPham sanpham) {
		{
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT ");
			sql.append("INTO sanpham ");
			sql.append("( ");
			sql.append("	ten_sp, ");
			sql.append("	id_dm, ");
			sql.append("	gia, ");
			sql.append("	hinhanh, ");
			sql.append("	mota ");
			sql.append(") ");
			sql.append("VALUES ");
			sql.append("( ");
			sql.append("	'" + sanpham.getTen_sp() + "', ");
			sql.append("	'" + sanpham.getId_dm() + "', ");
			sql.append("	'" + sanpham.getGia() + "', ");
			sql.append("	'" + sanpham.getHinhanh() + "', ");
			sql.append("	'" + sanpham.getMota() + "' ");
			sql.append(")");

			int insert = _jdbcTemplate.update(sql.toString());
			return insert;
		}
	}
}

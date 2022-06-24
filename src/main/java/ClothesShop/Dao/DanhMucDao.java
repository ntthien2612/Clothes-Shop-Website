package ClothesShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ClothesShop.Entity.ChiTietSanPham;
import ClothesShop.Entity.DanhMuc;
import ClothesShop.Entity.MapperChiTietSanPham;
import ClothesShop.Entity.MapperDanhMuc;
@Repository
public class DanhMucDao extends BaseDao{
	@Autowired
	public JdbcTemplate _jdbcTemplate;
//hien danh muc
	public List<DanhMuc> GetDataDanhMuc() {
		List<DanhMuc> list = new ArrayList<DanhMuc>();
		String sql = "select * from danhmuc";
		list = _jdbcTemplate.query(sql, new MapperDanhMuc());
		return list;
	}
	public List<DanhMuc> GetDataHienDanhMuc() {
		List<DanhMuc> list = new ArrayList<DanhMuc>();
		String sql = "select * from danhmuc";
		list = _jdbcTemplate.query(sql, new MapperDanhMuc());
		return list;
	}
//them danh muc
	public int AddDanhMuc(DanhMuc danhmuc) {
		{
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT ");
			sql.append("INTO danhmuc ");
			sql.append("( ");
			sql.append("	ten_dm ");
			sql.append(") ");
			sql.append("VALUES ");
			sql.append("( ");
			sql.append("	'"+danhmuc.getTen_dm()+"' ");
			sql.append(")");
			
			int insert = _jdbcTemplate.update(sql.toString());
			return insert;//tra ve ket qua cap nhat duoc bao nhieu dong
		}
	}
//xoa danh muc
	public List<DanhMuc> GetDataXoaDanhMuc(int id_xoa) {
		List<DanhMuc> list_sp = new ArrayList<DanhMuc>();
		String sql_sp = "delete from danhmuc where id_dm="+id_xoa;
		int delete = _jdbcTemplate.update(sql_sp.toString());
		return list_sp;
	}
<<<<<<< HEAD
//hien trang chinh sua
=======
>>>>>>> 9d9bc05f613d6ea382e57618d69eb9ab8aa50e3c
	public List<DanhMuc> GetDataSuaDanhMuc(int id_chinhsua) {
		List<DanhMuc> list = new ArrayList<DanhMuc>();
		String sql = "select * from danhmuc where id_dm="+id_chinhsua;
		list = _jdbcTemplate.query(sql, new MapperDanhMuc());
		return list;
	}
//sua danh muc
	public int ChinhSuaDanhMuc(DanhMuc danhmuc) {
		String sql = "update danhmuc set ten_dm="+"'"+danhmuc.getTen_dm()+"'"+" where id_dm="+danhmuc.getId_dm();
		int update = _jdbcTemplate.update(sql.toString());
		return update;
	}
}

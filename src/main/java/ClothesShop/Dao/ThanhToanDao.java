package ClothesShop.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Repository;

import ClothesShop.Entity.MapperGioHang;

@Repository
public class ThanhToanDao extends BaseDao {

	public List<String[]> MuaHang(String[] id) {
		List<String[]> list = new ArrayList<String[]>();
		List<String[]> arr = new ArrayList<String[]>();
		for(int i=0; i< id.length; i++) {
			String sql = "select id, giohang.id_sp, ten_sp, id_kh, gia, hinhanh, size, soluong_them from giohang join sanpham where sanpham.id_sp=giohang.id_sp and id="+id[i];
			list = _jdbcTemplate.query(sql, new MapperGioHang());
			System.out.print(list);
			arr.addAll(list);
		}
		
		return arr;
	}
}

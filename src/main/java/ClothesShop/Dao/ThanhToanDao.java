package ClothesShop.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Repository;

import ClothesShop.Entity.DonHang;
import ClothesShop.Entity.MapperGioHang;
import ClothesShop.Entity.MapperSanPham;
import ClothesShop.Entity.MapperThanhToan;
import ClothesShop.Entity.SanPham;

@Repository
public class ThanhToanDao extends BaseDao {

	//hien thi gio hang
		public List<String[]> HienThiThanhToan(String[] check) {
			List<String[]> list = new ArrayList<String[]>();
			String string;
			try {
				string = check[0];
				for (int i = 1; i < check.length; i++) {

					string += "," + check[i];
				}
			} catch (Exception e) {
				System.out.println("loi neeeeeeeeeeeeeeeeee");
				return null;
			}
			String sql = "SELECT id, giohang.id_sp, giohang.id_kh, hinhanh, ten_sp, gia, soluong_them ,size FROM `giohang` JOIN sanpham WHERE giohang.id_sp=sanpham.id_sp and id in ("
					+ string + ")";

			list = _jdbcTemplate.query(sql, new MapperGioHang());

			return list;
		}

		public List TongTien(String[] check) {
			List<String[]> list = new ArrayList<String[]>();
			String string;
			try {
			string= check[0];
			for (int i = 1; i < check.length; i++) {
				string += "," + check[i];
			}
			}catch (Exception e) {
				return null;
			}
			String sql = "SELECT  sum(gia*soluong_them) as tongtien FROM `giohang` JOIN sanpham WHERE giohang.id_sp=sanpham.id_sp and id in("
					+ string + ")";
			list = _jdbcTemplate.query(sql, new MapperThanhToan());

			return list;
		}

		public int SaveDonHang(DonHang donhang) {
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT ");
			sql.append("INTO donhang ");
			sql.append("( ");
			sql.append("	id_kh, ");
			sql.append("	tongtien, ");
			sql.append("	trangthai, ");
			sql.append("	ten_kh, ");
			sql.append("	email_kh, ");
			sql.append("	sdt, ");
			sql.append("	diachi ");
			sql.append(") ");
			sql.append("VALUES ");
			sql.append("( ");
			sql.append("	" + donhang.getId_kh() + ", ");
			sql.append("	" + donhang.getTongtien() + ", ");
			sql.append("	'" + donhang.getTrangthai() + "', ");
			sql.append("	'" + donhang.getTen_kh() + "', ");
			sql.append("	'" + donhang.getEmail_kh() + "', ");
			sql.append("	'" + donhang.getSdt() + "', ");
			sql.append("	'" + donhang.getDiachi() + "' ");
			sql.append(")");

			int insert = _jdbcTemplate.update(sql.toString());
			return insert;

		}

		public int SaveChiTietDonHang(int id_dh, String size, int gia, int id_sp, int soluong) {
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT ");
			sql.append("INTO chitietdonhang ");
			sql.append("( ");
			sql.append("	id_dh, ");
			sql.append("	id_sp, ");
			sql.append("	gia, ");
			sql.append("	soluong, ");
			sql.append("	size ");
			sql.append(") ");
			sql.append("VALUES ");
			sql.append("( ");
			sql.append("	" + id_dh + ", ");
			sql.append("	" + id_sp + ", ");
			sql.append("	" + gia + ", ");
			sql.append("	" + soluong + ", ");
			sql.append("	'" + size + "' ");
			sql.append(")");

			int insert = _jdbcTemplate.update(sql.toString());
			return insert;
		}

		public SanPham GetSanPham(int id) {
			SanPham list_sp = new SanPham();
			String sql_sp = "select * from sanpham where id_sp=" + id;
			list_sp = (SanPham) _jdbcTemplate.query(sql_sp, new MapperSanPham()).get(0);
			return list_sp;
		}

		public int GetIdDonHang() {

			String sql = "SELECT max(`id_dh`) FROM `donhang`";
			return _jdbcTemplate.queryForObject(sql, Integer.class);
		}

		public int DeleteGioHang(int id_sp) {
			String sql = "DELETE FROM `giohang` WHERE id_sp = " + id_sp;
			return _jdbcTemplate.update(sql);
		}
}

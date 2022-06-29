package ClothesShop.Service.User;

import java.util.List;

import ClothesShop.Entity.DonHang;
import ClothesShop.Entity.SanPham;

public interface IThanhToan {
	public List TongTien(String[] check);
	public List<String[]> HienThiThanhToan(String[] check);
	public int SaveThanhToan(DonHang donhang) ;
	public int SaveChiTietDonHang(int id_dh,String size, int gia, int id_sp, int soluong);
	public SanPham getSanPham(int id_sp);
	public int getIdDonHang();
	public int deleteGioHang(int id_sp);
}

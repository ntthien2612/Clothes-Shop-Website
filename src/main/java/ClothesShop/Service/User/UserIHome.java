package ClothesShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ClothesShop.Entity.ChiTietSanPham;
import ClothesShop.Entity.DanhMuc;
import ClothesShop.Entity.GioHang;
import ClothesShop.Entity.SanPham;

public interface UserIHome {
	@Autowired
	public List<SanPham> GetDataSanPham();
	public List<DanhMuc> GetDataDanhMuc();
	//khai bao get san pham theo doanh muc
	public List<SanPham> GetDataSanPham(int id);
	public List<SanPham> GetDataChiTiet(int id);
	public List<ChiTietSanPham> GetDataSizeChiTiet(int id);
	public List<SanPham> GetDataSanPham(String noidung);
}
